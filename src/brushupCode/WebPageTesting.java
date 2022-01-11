package brushupCode;

public class WebPageTesting {

	public static void main(String[] args) {
		
		WebPage loginPage = new WebPage("login", "www.test.com");
		WebPage homePage = new WebPage("home", "www.test.com/home");
		
		System.out.println(loginPage.title + " " +loginPage.url+" "+WebPage.logo);
	}

}
