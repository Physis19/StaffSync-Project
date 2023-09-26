package modules.sector.interfaces;

import java.util.List;

import modules.sector.Sector;

public interface ISectorManager {
    Sector createSector(String id, String name, String description);
    void removeSector(Sector sector);
    List<Sector> getAllSectors();
    Sector getSectorById(String id);
    void updateSector();
}
