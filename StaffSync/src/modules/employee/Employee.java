package modules.employee;

import modules.employee.interfaces.IEmployee;

import modules.providers.GenerateIdProvider;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private String sector;
    private String role;
    private String salary;

    public Employee(String id, String name, String sector, String role, String salary) {
        this.id = GenerateIdProvider.generateId();
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

    public String getSector() {
        return sector;
    }

    public String getRole() {
        return role;
    }

    public String getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public Employee createEmployee(String id, String nome, String Employees) {
        
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

    @Override
    public void listEmployee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listEmployee'");
    }

    @Override
    public void deleteEmployee() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
    }

    @Override
    public Employee updateEmployee(String id, String nome, String Employees) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }
}