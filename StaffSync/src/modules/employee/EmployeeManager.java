package modules.employee;

import java.util.ArrayList;
import java.util.List;

import modules.employee.interfaces.IEmployeeManager;
import modules.providers.GenerateEmployeeIdProvider;
import modules.sector.Sector;

public class EmployeeManager implements IEmployeeManager {
    private List<Employee> employeesList;

    public EmployeeManager() {
        employeesList = new ArrayList<>();
    }

    @Override
    public Employee createEmployee(String name, Sector sector, String role, float salary) {
        String newEmployeeId = GenerateEmployeeIdProvider.generateId();
        
        for (Employee existingEmployee : employeesList) {
            if (existingEmployee.getId().equals(newEmployeeId)) {
                throw new IllegalArgumentException("Já existe um funcionário com este ID.");
            }
        }
        
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
        throw new IllegalArgumentException("Funcionário com o ID especificado não encontrado.");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeesList.remove(employee);
    }

    @Override
    public Employee updateEmployee(String id, String name, Sector sector, String role, float salary) {
        for (Employee employee : employeesList) {
            if (employee.getId().equals(id)) {
                employee.setName(name);
                employee.setRole(role);
                employee.setSalary(salary);

                if (!employee.getSector().getName().equals(sector.getName())) {
                    employee.setSector(sector);
                }

                return employee;
            }
        }
        throw new IllegalArgumentException("Funcionário com o ID especificado não encontrado para atualização.");
    }   
}
