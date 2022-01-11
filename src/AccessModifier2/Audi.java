package AccessModifier2;

import AccessModifier1.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		System.out.println(a.name);
		System.out.println(a.engine);
		
		a.getName();
		a.getEngine();
		

	}

}
