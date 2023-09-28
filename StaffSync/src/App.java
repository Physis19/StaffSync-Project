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
            System.out.println("           MENU          ");
            System.out.println("===================================");
            System.out.println("1 - Criar funcionário\n2 - Criar setor\n3 - Listar os funcionários\n4 - Obter funcionário pelo ID\n5 - Deletar funcionário\n6 - Deletar setor\n7 - Listar os setores\n8 - Obter setor pelo ID\n9 - Atualizar dados do funcionário");

            System.out.print("\nDigite a sua opção ou -1 para sair: ");
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("\n===================================");
                    System.out.println("           Criar funcionário          ");
                    System.out.println("===================================\n");

                    Scanner entrada2 = new Scanner(System.in);
                
                    System.out.print("Nome do funcionário: ");
                    String name = entrada2.nextLine();

                    System.out.print("Setor que trabalha: ");
                    String sectorN = entrada2.nextLine();

                    System.out.print("Breve descrição sobre o setor: ");
                    String descriptionSectorEmployee = entrada2.nextLine();

                    Sector createSector = sectorManager.createSector(sectorN, descriptionSectorEmployee);

                    System.out.print("Cargo do funcionário: ");
                    String role = entrada2.nextLine();

                    System.out.print("Salário: ");
                    float salary = entrada2.nextFloat();

                    Employee employee1 = employeeManager.createEmployee(name, createSector, role, salary);
        
                    System.out.println("\nO funcionário "+employee1.getName() +" foi adicionado com sucesso!\n");

                    System.out.println(employee1.getId());

                    break;
                
                case 2:
                    System.out.println("\n===================================");
                    System.out.println("           Criar setor          ");
                    System.out.println("===================================\n");
                    Scanner entrada3 = new Scanner(System.in);

                    System.out.print("Qual o nome do setor: ");
                    String sectorName = entrada3.nextLine();

                    System.out.print("Breve descrição sobre o setor: ");
                    String descriptionSector = entrada3.nextLine();

                    Sector sector1 = sectorManager.createSector(sectorName, descriptionSector);
             
                    System.out.println("\nO setor "+sector1.getName() +" foi adicionado com sucesso!\n");
                    System.out.println(sector1.getId());
                    break;

                case 3:
                    System.out.println("\n========================================");
                    System.out.println("       Listagem de funcionários       ");
                    System.out.println("========================================\n");
                   
                    for (Employee employee: employeeManager.getAllEmployees()) {
                        System.out.println(employee.getName());
                    }

                    break;

                case 4:
                    System.out.println("\n=====================================");
                    System.out.println("       Funcionário através do ID       ");
                    System.out.println("======================================\n");

                    Scanner entrada4 = new Scanner(System.in);
                
                    System.out.print("Digite o ID do funcionário: ");
                    String id = entrada4.nextLine();
                    
                    Employee employeeID = employeeManager.getEmployeeById(id);
                    
                    System.out.println("\nFuncionário: "+employeeID.getName() +"\nSetor: "+employeeID.getSector().getName() +"\nCargo: "+employeeID.getRole()+"\nSalário: "+employeeID.getSalary()+"\n");

                    break;

                case 5:
                    System.out.println("\n=================================");
                    System.out.println("       Deletar funcionário       ");
                    System.out.println("==================================\n");
                    
                    Scanner entrada5 = new Scanner(System.in);
                    
                    System.out.print("Digite o ID do funcionário: ");
                    String id2 = entrada5.nextLine();

                    Employee employeeDeleteID = employeeManager.getEmployeeById(id2);
                    employeeManager.deleteEmployee(employeeDeleteID);

                    System.out.println("\nFuncionário foi removido com sucesso!\n");

                    break;
                
                case 6:
                    System.out.println("\n==========================");
                    System.out.println("       Deletar setor       ");
                    System.out.println("============================\n");

                    Scanner entrada6 = new Scanner(System.in);
                    System.out.println("Digite o ID do setor: ");
                    String idSector = entrada6.nextLine();

                    Sector sectorDeleteID = sectorManager.getSectorById(idSector);
                    sectorManager.removeSector(sectorDeleteID);

                    System.out.println("\nSetor foi removido com sucesso!\n");

                    break;

                case 7:
                    System.out.println("\n========================================");
                    System.out.println("       Listagem de setores       ");
                    System.out.println("========================================\n");
                   
                    for (Sector sectors: sectorManager.getAllSectors()) {
                        System.out.println(sectors.getName());
                    }

                    break;
                
                case 8:
                    System.out.println("\n=====================================");
                    System.out.println("       Setor através do ID       ");
                    System.out.println("======================================\n");

                    Scanner entrada7 = new Scanner(System.in);
                
                    System.out.print("Digite o ID do setor: ");
                    String idSector2 = entrada7.nextLine();
                    
                    Sector sectorID = sectorManager.getSectorById(idSector2);
                    
                    System.out.println("\nSetor: "+sectorID.getName() +"\nDescrição: "+sectorID.getDescription()+"\n");

                    break;

                case 9:
                    System.out.println("\n==========================================");
                    System.out.println("       Atualizar funcionário       ");
                    System.out.println("===========================================\n");

                    Scanner entrada9 = new Scanner(System.in);
                    
                    System.out.println("Digite o ID do funcionário: ");
                    String idUpdate = entrada9.nextLine();

                    System.out.print("Nome do funcionário: ");
                    String nameUpdate = entrada9.nextLine();

                    System.out.print("Setor que trabalha: ");
                    String sectorUpdate = entrada9.nextLine();

                    System.out.print("Breve descrição sobre o setor: ");
                    String descriptionSectorEmployeeUpdate = entrada9.nextLine();

                    Sector createSector2 = sectorManager.createSector(sectorUpdate, descriptionSectorEmployeeUpdate);

                    System.out.print("Cargo do funcionário: ");
                    String roleUpdate = entrada9.nextLine();

                    System.out.print("Salário: ");
                    float salaryUpdate = entrada9.nextFloat();

                    employeeManager.updateEmployee(idUpdate, nameUpdate, createSector2, roleUpdate, salaryUpdate);

                    System.out.println("\nFuncionário atualizado com sucesso!\n");

                    break;
            }
        } while(opcao != -1);
        
        entrada.close();
    }
}