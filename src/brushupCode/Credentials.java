package brushupCode;

public class Credentials {
	
	String username;
	String password;
	
	
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//getters
	public String getUserName() {
		return this.username;
		
	}
	

	public String getUserPassword() {
		return this.password;
		
	}
	
	public void doLogin(String un,String pwd) {
		System.out.println("logged in user is : " + un + pwd);
		
	}
}
