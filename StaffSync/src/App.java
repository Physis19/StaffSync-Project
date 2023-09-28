import java.util.List;
import java.util.Scanner;

import modules.employee.Employee;
import modules.sector.Sector;
import modules.sector.SectorManager;
import modules.employee.EmployeeManager;

public class App {
    public static void main(String[] args) {
        SectorManager sectorManager = new SectorManager();
        EmployeeManager employeeManager = new EmployeeManager();
        
        System.out.println("Bem vindo ao sistema StaffSync, que será responsável pelo gerenciamento de funcionários e setores dessa empresa.");
        System.out.println("Segue abaixo um menu de opções\n");

        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("===================================");
            System.out.println("           MENU           ");
            System.out.println("===================================");
            System.out.println("1 - Criar funcionário\n2 - Criar setor\n3 - Listar os funcionários\n4 - Obter funcionário pelo ID\n5 - Deletar funcionário\n6 - Remover setor\n7 - Listar os setores\n8 - Obter setor pelo ID\n9 - Adicionar funcionário ao setor");

            System.out.println("Digite a sua opção ou -1 para sair: ");
            opcao = entrada.nextInt();
        } while(opcao != -1);
        
        entrada.close();
        
        Sector sector1 = sectorManager.createSector("Test", "testando");
        


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
