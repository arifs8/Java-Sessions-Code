package brushupCode;

public class TryCatchBlock {
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			int i =9/0;
			System.out.println("B");
		}
		catch(NullPointerException e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("exception occured");
			e.printStackTrace();
		}
		
		System.out.println("A");
		System.out.println("A");
	}
	
	

}
