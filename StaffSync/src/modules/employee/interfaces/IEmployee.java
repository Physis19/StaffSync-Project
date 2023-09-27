package modules.employee.interfaces;

import modules.sector.Sector;

public interface IEmployee {
    String getId();
    void setId(String id);

    String getName();
    void setName(String name);

    Sector getSector();
    void setSector(Sector sector);

    String getRole();
    void setRole(String role);

    float getSalary();
    void setSalary(float salary);
    
}