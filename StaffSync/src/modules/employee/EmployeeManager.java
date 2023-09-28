package modules.employee;

import java.util.ArrayList;
import java.util.List;

import modules.employee.interfaces.IEmployeeManager;
import modules.providers.GenerateIdProvider;
import modules.sector.Sector;

public class EmployeeManager implements IEmployeeManager {

    private List<Employee> employeesList;

    public EmployeeManager() {
        employeesList = new ArrayList<>();
    }

    @Override
    public Employee createEmployee(String name, Sector sector, String role, float salary) {
        String newEmployeeId = GenerateIdProvider.generateId();
        Employee newEmployee = new Employee(newEmployeeId, name, sector, role, salary);

        employeesList.add(newEmployee);
        return newEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeesList;
    }

    public Employee getEmployeeById(String id) {
        for (Employee employee : employeesList) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeesList.remove(employee);
    }

    @Override
    public Employee updateEmployee(String id, String name, String Employees) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }
    
}