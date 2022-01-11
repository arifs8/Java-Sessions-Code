package brushupCode;

public class StaticNonStatic {
	
	String name;
	static int age;
	
	public static void main (String a[])
	{
		StaticNonStatic obj = new StaticNonStatic();
		obj.name = "tell";
		System.out.println(obj.name);
		getEmail();
		age = 20;
		StaticNonStatic.getEmail();
		StaticNonStatic.age =30;
	}
	
	public void getName() {
		System.out.println("get name");
	}

	public static void getEmail() {
		System.out.println("get email");
	}
}
//1.call then directly 
//2.class name
