import java.util.List;

import modules.employee.Employee;
import modules.sector.Sector;
import modules.sector.SectorManager;
import modules.employee.EmployeeManager;

public class App {
    public static void main(String[] args) {
        SectorManager sectorManager = new SectorManager();
        EmployeeManager employeeManager = new EmployeeManager();

        Sector sector1 = sectorManager.createSector("Test", "testando");
        Employee employee1 = employeeManager.createEmployee("Test", sector1, "Teste", 1000);

        List<Employee> employeesList = employeeManager.getAllEmployees();

        for (Employee employee : employeesList) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Sector: " + employee.getSector());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }

    }
}
