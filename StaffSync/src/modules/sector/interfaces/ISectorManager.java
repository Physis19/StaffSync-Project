package modules.sector.interfaces;

import java.util.List;

import modules.employee.Employee;
import modules.sector.Sector;

public interface ISectorManager {
    Sector createSector(String name, String description);
    void removeSector(Sector sector);
    List<Sector> getAllSectors();
    Sector updateSector(String id, String name, String description);
    void addEmployeeToSector(Sector sector, Employee employee);
    Sector sectorExists(String name);
    Sector getSectorById(String id);
}
