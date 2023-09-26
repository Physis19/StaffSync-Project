package modules.employee;

import modules.employee.interfaces.IEmployee;

import modules.sector.Sector;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private Sector sector;
    private String role;
    private float salary;

    public Employee(String id, String name, Sector sector, String role, float salary) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.role = role;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public Sector getSector() {
        return sector;
    }

    public String getRole() {
        return role;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}