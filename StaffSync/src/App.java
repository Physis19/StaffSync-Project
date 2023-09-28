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

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("===================================");
            System.out.println("           MENU          ");
            System.out.println("===================================");
            System.out.println("1 - Criar funcionário\n2 - Criar setor\n3 - Listar os funcionários\n4 - Deletar funcionário\n5 - Deletar setor\n6 - Listar os setores");

            System.out.print("\nDigite a sua opção ou -1 para sair: ");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("\n===================================");
                    System.out.println("           Criar funcionário          ");
                    System.out.println("===================================\n");

                    Scanner scanner2 = new Scanner(System.in);
                
                    System.out.print("Nome do funcionário: ");
                    String name = scanner2.nextLine();

                    System.out.print("Setor que trabalha: ");
                    String sectorN = scanner2.nextLine();

                    Sector sectorEmployee = sectorManager.sectorExists(sectorN);

                    System.out.print("Cargo do funcionário: ");
                    String role = scanner2.nextLine();

                    System.out.print("Salário: ");
                    float salary = scanner2.nextFloat();

                    Employee employee1 = employeeManager.createEmployee(name, sectorEmployee, role, salary);
                    sectorManager.addEmployeeToSector(sectorEmployee, employee1);
        
                    System.out.println("\nO funcionário "+employee1.getName() +" foi adicionado com sucesso!\n");

                    break;
                
                case 2:
                    System.out.println("\n===================================");
                    System.out.println("           Criar setor          ");
                    System.out.println("===================================\n");
                    Scanner scanner3 = new Scanner(System.in);

                    System.out.print("Qual o nome do setor: ");
                    String sectorName = scanner3.nextLine();

                    System.out.print("Breve descrição sobre o setor: ");
                    String descriptionSector = scanner3.nextLine();

                    Sector sector1 = sectorManager.createSector(sectorName, descriptionSector);
             
                    System.out.println("\nO setor "+sector1.getName() +" foi adicionado com sucesso!\n");
                    break;

                case 3:

                    System.out.println("\n=================================");
                    System.out.println("       Listagem de funcionários       ");
                    System.out.println("==================================\n");
                    List<Employee> employees = employeeManager.getAllEmployees();

                    if (employees.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Employee employee : employees) {
                            System.out.println("ID: " + employee.getId());
                            System.out.println("Nome: " + employee.getName());
                            System.out.println("Setor: " + employee.getSector().getName());
                            System.out.println("Cargo: " + employee.getRole());
                            System.out.println("Salário: " + employee.getSalary());
                            System.out.println("--------------------------------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=================================");
                    System.out.println("       Deletar funcionário       ");
                    System.out.println("==================================\n");
                    
                    Scanner scanner5 = new Scanner(System.in);
                    
                    System.out.print("Digite o ID do funcionário: ");
                    String id2 = scanner5.nextLine();

                    Employee employeeDeleteID = employeeManager.getEmployeeById(id2);
                    employeeManager.deleteEmployee(employeeDeleteID);

                    System.out.println("\nFuncionário foi removido com sucesso!\n");

                    break;
                
                case 5:
                    System.out.println("\n==========================");
                    System.out.println("       Deletar setor       ");
                    System.out.println("============================\n");

                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Digite o ID do setor: ");
                    String idSector = scanner6.nextLine();

                    Sector sectorDeleteID = sectorManager.getSectorById(idSector);
                    sectorManager.removeSector(sectorDeleteID);

                    System.out.println("\nSetor foi removido com sucesso!\n");

                    break;

                case 6:
                    System.out.println("\n========================================");
                    System.out.println("       Listagem de setores       ");
                    System.out.println("========================================\n");
                    List<Sector> sectorList = sectorManager.getAllSectors();
                    List<Employee> employeesList = employeeManager.getAllEmployees();

                    if(sectorList.isEmpty()) {
                        System.out.println("Nenhum setor cadastrado.");
                    } else {
                        for (Sector sector : sectorList) {
                            System.out.println("ID: " + sector.getId());
                            System.out.println("Nome: " + sector.getName());
                            System.out.println("Descrição: " + sector.getDescription());
                            System.out.println("Funcionários: ");

                            for (Employee employee : employeesList) {
                                if (employee.getSector().getId().equals(sector.getId())) {
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("    ID: " + employee.getId());
                                    System.out.println("    Nome: " + employee.getName());
                                    System.out.println("    Setor: " + employee.getSector().getName());
                                    System.out.println("    Cargo: " + employee.getRole());
                                    System.out.println("    Salário: " + employee.getSalary());
                                    System.out.println("--------------------------------------------------");
                                }
                            }


                            System.out.println("--------------------------------------------------");
                        }
                    }

                    break;
            }
        } while(option != -1);
        
        scanner.close();
    }
}