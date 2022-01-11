package brushupCode;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		String browser = "IE";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch safari");
		}
		else {
			try {
			throw new Exception("Please enter valid data");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
