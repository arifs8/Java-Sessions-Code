package brushupCode;

public class FacebookLogin {

	public static void main(String[] args) {
		
		Credentials cred = new Credentials("reshma", "123456");
//		System.out.println(cred.getUserName());
//		System.out.println(cred.getUserPassword());
		
		cred.doLogin(cred.getUserName(), cred.getUserPassword());

	}

}
