package brushupCode;

public class Student {
	
	//object reference transfer
	String name;
	int age;

	public static void main(String[] args) {
		
		Student s1 = new Student ("Jerry" , 25);
		Student s2 = new Student ("Tom" , 35);
		Student s3 = new Student ("Anu" , 45);
		
		System.out.println(s1.name +" "+s1.age);
		System.out.println(s2.name +" "+s2.age);
		System.out.println(s3.name +" "+s3.age);
		
		s1 = s2;
		
		System.out.println(s1.name +" "+s1.age);
		System.out.println(s2.name +" "+s2.age);
		System.out.println(s3.name +" "+s3.age);
		
		s2=s3;
		
		System.out.println(s1.name +" "+s1.age);
		System.out.println(s2.name +" "+s2.age);
		System.out.println(s3.name +" "+s3.age);
		
		s3=s1;
		
		System.out.println(s1.name +" "+s1.age);
		System.out.println(s2.name +" "+s2.age);
		System.out.println(s3.name +" "+s3.age);

	}
	
	public Student(String name,int age) {
		this.name =name;
		this.age = age;
	}
	

}
