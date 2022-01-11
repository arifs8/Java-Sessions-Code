package brushupCode;

public class Amazon {
	//methods cannot be duplicated
	//method overloading //complie time polymorphism 
	//same class
	//1.same method name
	//2.different data type
	//3.sequence of params
	//assignment static nonstatic and method overloading
	//main method can be overloaded --yes we can overload maim method but main() signature should not be changed

	public static void main(String[] args) {
		Amazon ama = new Amazon();
		ama.search("cloth");
		ama.search(2000);
		ama.search("pants");
		ama.search("pants",3000);
		ama.search(4000,"pants","red");
		main(20);
		main("overload");

	}
	
	public static void main (int marks) {
		System.out.println("marks");
	}
	
	public static void main (String value){
		System.out.println(value);
	}
	
	public void search() {
		System.out.println("empty search");
	}
	
   public void search(String name) {
		System.out.println("name of the item " + name);
	}
   public void search(int price) {
		System.out.println("item price" + price);
	
	}
   
   public void search(int price,String name,String color) {
	   System.out.println("item price name color" + price +name +color);
	}
   public void search(int price,String name) {
		System.out.println("price name" +price +name);
  	}
   
   public void search(String name,int price) {
	   System.out.println("name price" +name +price);
 	}


}
