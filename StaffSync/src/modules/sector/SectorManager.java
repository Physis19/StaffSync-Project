package modules.sector;

import java.util.ArrayList;
import java.util.List;

import modules.employee.Employee;
import modules.providers.GenerateSectorIdProvider;
import modules.sector.interfaces.ISectorManager;

public class SectorManager implements ISectorManager {
    private List<Sector> sectorList;

    public SectorManager() {
        sectorList = new ArrayList<>();
    }

    public Sector createSector(String name, String description) {
        String newSectorId = GenerateSectorIdProvider.generateId();
        
        for (Sector existingSector : sectorList) {
            if (existingSector.getId().equals(newSectorId)) {
                throw new IllegalArgumentException("Já existe um setor com este ID.");
            }
        }
        
        Sector newSector = new Sector(newSectorId, name, new ArrayList<>(), description);
        sectorList.add(newSector);
        return newSector;
    }

    public void removeSector(Sector sector) {
        sectorList.remove(sector);
    }

    public List<Sector> getAllSectors() {
        return sectorList;
    }

    public Sector updateSector(String id, String name, String description) {
        for (Sector sector : sectorList) {
            if (sector.getId().equals(id)) {
                sector.setName(name);
                sector.setDescription(description);
                return sector;
            }
        }
        throw new IllegalArgumentException("O setor não existe!");
    }

    public void addEmployeeToSector(Sector sector, Employee employee) {
        if (sector != null && employee != null) {
            if (sector.getEmployees().contains(employee)) {
                throw new IllegalArgumentException("O funcionário já pertence ao setor!");
            } else {
                sector.getEmployees().add(employee);
            }
        }
    }

    @Override
    public Sector sectorExists(String name) {
        for (Sector sector : sectorList) {
            if (sector.getName().equals(name)) {
                return sector;
            }
        }

        throw new IllegalArgumentException("O setor não existe!");
    }

    public Sector getSectorById(String id) {
        for (Sector sector : sectorList) {
            if (sector.getId().equals(id)) {
                return sector;
            }
        }
        throw new IllegalArgumentException("O setor não existe!");
    }
}
