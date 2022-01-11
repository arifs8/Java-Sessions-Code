package brushupCode;

import java.util.ArrayList;

public class User {
	
	String name;
	int age;
	String email;
	boolean isActive;
	char gender;
	long phonenumer;
	ArrayList<String> paymentOptions;
	
	//constructor - special entity of any class
	//similar to method,but not method
	//no void and no return
	//should be same as class name

	public static void main(String[] args) {
		ArrayList<String> paymentOptions = new ArrayList<String>();
		paymentOptions.add("gpay");
		paymentOptions.add("phonepe");
		
		User u1 = new User("Tom", 25,"user@gmail.com" ,true,paymentOptions);
		User u2 = new User("deep", 40,"user1@gmail.com" ,false,paymentOptions);
		
		System.out.println(u1.name +u1.age+u1.email +u1.isActive +u1.paymentOptions);
		System.out.println(u2.name +u2.age+u2.email +u2.isActive +u2.paymentOptions);

	}
	
	public User() { //no param cons - default constructor
		System.out.println("No param constructor");
	}

	public User(int i ) { //one param cons - default constructor
		System.out.println("one param constructor" + i);
	}
	
	public User(int i ,String p) { //two param cons - default constructor
		System.out.println("two param constructor" + i + " " + p);
	}
	

	public User(String name ,int age,String email) { //two param cons - default constructor
		System.out.println(name + age + email);
	}
	
	public User(String name ,int age,String email,boolean isActive ,ArrayList<String> paymentOptions) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.isActive = isActive;
		this.paymentOptions = paymentOptions;
	}
	
}
