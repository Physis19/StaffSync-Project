package modules.sector.interfaces;

import modules.employee.Employee;
import modules.sector.Sector;

public interface ISector {
    Sector createSector(String id, String name, String description);
    void listSector();
    void deleteSector();
    Sector updateSector(String id, String name, String Employees);
}
