package brushupCode;

public class Audi extends Car {
	
    @Override
	public void start() {
		System.out.println("Audi...Start");
	}

    @Override
	public void refuel() {
		System.out.println("Audi...Refuel");
	}
}
