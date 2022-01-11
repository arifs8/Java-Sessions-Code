package brushupCode;

public class Car extends Vehicle {
	
	public void start() {
		System.out.println("Car......Start");
		
	}

	public void stop() {
		System.out.println("Car......Stop");
	}
	
	public void refuel() {
		System.out.println("Car......Refuel");
	}

	//static methods cannot be overridden --static prevents that method for inheriting
	//final methods cannot be overridden--final prevents that method for inheriting
	//class as final ---not possible to inherit
	//private method ---cannot be overridden
	
}
