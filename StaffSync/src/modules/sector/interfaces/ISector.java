package modules.sector.interfaces;

import modules.sector.Sector;

public interface ISector {
    Sector createSector(String id, String name, String Employees);
    void listSector();
    void deleteSector();
    Sector updateSector(String id, String name, String Employees);
}