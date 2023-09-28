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
    public Employee updateEmployee(String id, String name, Sector sector, String role, float salary) {
        for(Employee employees: employeesList) {
            if(employees.getId().equals(id)) {
                employees.setName(name);
                employees.setRole(role);
                employees.setSalary(salary);

                if (!employees.getSector().getName().equals(sector.getName())) {
                    employees.setSector(sector);
                }

                return employees;
            }
        }

        return null;
    }   
}