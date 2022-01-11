package brushupCode;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Tom",25,20000);
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.getSalary());
		emp.getAddress();
		emp.getEmployeeBankAccount();

	}

}
