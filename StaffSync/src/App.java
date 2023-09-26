import java.util.List;

import modules.sector.Sector;
import modules.sector.SectorManager;

public class App {
    public static void main(String[] args) {
        SectorManager sectorManager = new SectorManager();

        sectorManager.createSector( "test", "test" );
        sectorManager.createSector( "test2", "test2" );

        List<Sector> allSectors = sectorManager.getAllSectors();

       for (Sector sector : allSectors) {
            System.out.println("ID: " + sector.getId());
            System.out.println("Name: " + sector.getName());
            System.out.println();
        
        }
    }
}
