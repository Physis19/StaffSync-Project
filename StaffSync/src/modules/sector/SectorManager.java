package modules.sector;

import java.util.ArrayList;
import java.util.List;

import modules.providers.GenerateIdProvider;
import modules.sector.interfaces.ISectorManager;

public class SectorManager implements ISectorManager {
    private List<Sector> sectorList;

    public SectorManager() {
        sectorList = new ArrayList<>();
    }

    public Sector createSector(String id, String name, String description) {
        String newSectorId = GenerateIdProvider.generateId();
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

    public Sector getSectorById(String id) {
        for (Sector sector : sectorList) {
            if (sector.getId().equals(id)) {
                return sector;
            }
        }
        return null;
    }

    public void updateSector(){

    }

}
