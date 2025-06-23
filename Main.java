package EMP;

import java.util.Scanner;

public class Main {
	public static void main(String arg[])
	{
		EmployeeService service = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n------EMPLOYEE MANAGEMENT SYSTEM------");
			System.out.println("1. ADD EMPLOYEE");
			System.out.println("2. VIEW EMPLOYEES");
			System.out.println("3. UPDTAE EMPLOYEE");
			System.out.println("4. DELETE EMPLOYEE");
			System.out.println("5. EXIT");
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
				case 1 -> {
					System.out.println("Enter EID: ");
					int eid = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter name : ");
					String name = scanner.nextLine();
					System.out.println("Enter salary : ");
					int esal = scanner.nextInt();
					service.addEmployee(new Employee(eid, name, esal));
				}
				case 2 -> service.viewEmployee();
				case 3 -> {
					System.out.print("Enter EID to update : ");
					int eid = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter New Name : ");
					String newName = scanner.nextLine();
					System.out.print("Enter New Salary : ");
					int esal = scanner.nextInt();
					service.updateEmployee(eid,newName, esal);
				}
				case 4 ->
				{
					System.out.print("Enter EID to delete : ");
					int eid = scanner.nextInt();
					service.deleteEmployee(eid);
				}
				case 5 -> System.out.println("Exitiing...");
				default -> System.out.println("Invalid");
				}
			}
		while(choice!=5);
		scanner.close();
		}
}
