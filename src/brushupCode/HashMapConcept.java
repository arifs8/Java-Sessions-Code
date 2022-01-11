package brushupCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	
	//doesnt work  based on indexing
	//key value pair

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Java");
		map.put(2, "c");
		map.put(3, "c++");
		map.put(3, "Python");
//		map.put(null, "javaScript");
//		map.put(null, null);
//		map.put(null, null);
		
		//get the values
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		//System.out.println(map.get(null));
		
		//for each loop
		for(Map.Entry<Integer,String> entry:map.entrySet())
		{
			System.out.println("key = "+entry.getKey()+"value =" +entry.getValue());
		}

		map.forEach((x,y)-> System.out.println("key = "+x+"value =" +y));
	}

}
