package brushupCode;

public class BrwserTest {

	public static void main(String[] args) {
	
		Browser br = new Browser();
		br.launchBrowser();
		br.setPlugin("postman");
		System.out.println(br.getPlugin());

	}

}
