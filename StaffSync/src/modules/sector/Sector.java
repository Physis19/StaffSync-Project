package modules.sector;

import java.util.ArrayList;
import java.util.List;

import modules.employee.Employee;
import modules.sector.interfaces.ISector;

public class Sector implements ISector {
    private String id;
    private String name;
    private List<Employee> employees;
    private String description;

    public Sector(String name) {
        this.name = name;
    }

    public Sector(String id, String name, List<Employee> employees, String description) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
        this.description = description;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
}