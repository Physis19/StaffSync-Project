package modules.employee.interfaces;

import java.util.List;

import modules.employee.Employee;
import modules.sector.Sector;

public interface IEmployeeManager {
    Employee createEmployee(String name, Sector sector, String role, float salary);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
    public void deleteEmployee(Employee employee);
    Employee updateEmployee(String id, String name, String Employees);
}
