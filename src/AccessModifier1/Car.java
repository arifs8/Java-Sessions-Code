package AccessModifier1;

public class Car {
	
	public String name = "suzuki";
	private int price = 30;
	protected String engine ="petrol";
	int wheels = 4;
	
	public void getName()
	{
		System.out.println("get car name");
	}
	private void getPrice()
	{
		System.out.println("get price name");
	}
	protected void getEngine()
	{
		System.out.println("get engine name");
	}
	 void getWheels()
	{
		System.out.println("get wheels name");
	}
	

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.engine);
		System.out.println(c.wheels);
		
		c.getName();
		c.getPrice();
		c.getEngine();
		c.getWheels();
		

	}

}
