package brushupCode;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	
	public void getAddress() {
		System.out.println("Get Address of the employee");
	}
	
	private void getBankAccount() {
		System.out.println("Bank account details of employee");
	}

	public int getSalary() {
		return salary;
	}
	
	public void getEmployeeBankAccount() {
		getBankAccount();
	}
}
