package modules.sector.interfaces;

import java.util.List;

import modules.employee.Employee;
import modules.sector.Sector;

public interface ISectorManager {
    Sector createSector(String name, String description);
    void removeSector(Sector sector);
    List<Sector> getAllSectors();
    Sector getSectorById(String id);
    void addEmployeeToSector(Sector sector, Employee employee);
}
