package modules.sector;

import modules.providers.GenerateIdProvider;
import modules.sector.interfaces.ISector;

public class Sector implements ISector {
    private String id;
    private String name;
    private String employees;

    public Sector(String id, String name, String employees) {
        this.id = GenerateIdProvider.generateId();
        this.name = name;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }
    
    @Override
    public Sector createSector(String id, String name, String employees) {
        return new Sector(id, name, employees);
    }

    @Override
    public Sector updateSector(String id, String name, String employees) {
        return new Sector(id, name, employees);
    }

    @Override
    public void deleteSector() {
        //Implement delete CRUD after create array's
    }

    @Override
    public void listSector() {
        //Implement list CRUD
    }
}