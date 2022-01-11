package brushupCode;

public class MethodChaining {   //non static can call non static
	  							//static can call static
								//non static can call static
								//static can call non static only by object creation
	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}
	
	public void m3() {
		m1();
		c2();
	}
	
	public static void c1()
	{
		c2();
	}
	
	public static void c2() {
		System.out.println("c2");
	}
}
