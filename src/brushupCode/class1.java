package brushupCode;


public class class1 {

	public static void main(String[] args) {
		
	int	myNum =5;
	int	myNum1 =15;
	myNum +=myNum1;
	
	char letter = 'r';
	double dec = 5.99 ;
	boolean check = true;
	
	System.out.println(myNum);
	System.out.println(myNum+" is the value required");
	
	String name = "hello world"; //sequence of char
	String name1 = "hello world";
	
	String s2= new String("welcome");
	String s3= new String("welcome");
	
	String[] splittedstring = name.split(" ");
	
	System.out.println(splittedstring[0]);
	System.out.println(splittedstring[1]);
	
	String word = "i love coding";
	String[] splittedword = word.split("love");
	
	System.out.println(splittedword[0]);
	System.out.println(splittedword[1].trim());
	
	for (int i=0;i<word.length();i++) {
		System.out.println(word.charAt(i));
	}
	
	for (int i=word.length()-1;i>=0;i--) {
		System.out.println(word.charAt(i));
	}
	
	/**
	 * String literal
	 * using new keyword
	 */
	
	}

}
