package AccessModifier1;

public class Bike {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.engine);
		System.out.println(c.wheels);
		
		c.getName();
		c.getEngine();
		c.getWheels();
		

	}

}
