package brushupCode;

public class BMW extends Car{
	
	@Override //when we have a method in parent class and same method in child class with the same name and same number of args
	//run time polymorphism
	public void start() {
		System.out.println("BMW.....Start");
	}

	public void autoParking() {
		System.out.println("BWM......AutoParking");
	}
}
