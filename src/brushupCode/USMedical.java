package brushupCode;

public interface USMedical {
	
	int minFees = 100; //by default static and final in nature
	
	//only method declaration
	//no method implementation
	//abstract methods
	//can not create an object for interface
	
	//jdk1.8 ----1.you can create static methods but it should have implemetation in interface
	//2.default methods
	
	public void cardioServices();
	
	public void neuroServcies();
	
	public static void medicine() {
		System.out.println("US.......Medicine");
	}
	
	default void nursing() {
		System.out.println("USMedical......Nursing");
	}

}
