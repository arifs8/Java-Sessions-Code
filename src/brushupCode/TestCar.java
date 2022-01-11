package brushupCode;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
	
		Audi a = new Audi();
		a.start();
		a.refuel();
		a.stop();
		a.engine();
		
		//TOP CASTING
		Car c1 = new BMW(); //child class object can be refereed by parent class variable
		c1.start(); //overridden and inherited methods
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//DOWN CASTING
		BMW b1 = (BMW) new Car(); //parent object with child reference not possible without casting
		//class cast exception
		//down casting not allowed during run time
		//Car cannot be cast to class BMW
		b1.start(); 

	}

}
