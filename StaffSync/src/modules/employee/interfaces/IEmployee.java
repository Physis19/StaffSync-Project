package modules.employee.interfaces;

import modules.employee.Employee;

public interface IEmployee {
    Employee createEmployee(String id, String nome, String Employees);
    public void listEmployee();
    public void deleteEmployee();
    Employee updateEmployee(String id, String nome, String Employees);
}