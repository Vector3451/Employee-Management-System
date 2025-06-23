package EMP;

import java.util.List;
import java.util.ArrayList;
public class EmployeeService {
	private final List<Employee> employees = new ArrayList<>();
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
		System.out.println("Employee added successfuly");
	}
	public void viewEmployee()
	{
		if(employees.isEmpty())
		{
			System.out.println("No elements to display");
		}
		else
		{
			employees.forEach(System.out::println);
		}
	}
	public void updateEmployee(int eid, String newName, int newesal)
	{
		for(Employee employee : employees)
		{
			if(employee.getId() == eid)
			{
				employee.setName(newName);
				employee.setEsal(newesal);
				System.out.println("Employee updated");
				return;
			}
		}
	}
	public void deleteEmployee(int eid)
	{
		employees.removeIf(s -> s.getId() == eid);
		System.out.println("Employee deleted (if existed).");
	}
}

