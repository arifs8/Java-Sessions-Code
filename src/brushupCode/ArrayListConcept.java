package brushupCode;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		//1.size is fixed
		//2.can store simliar type of datatype
		//default class in jdk
		//dynamic in nature
		//generics - we can store only single type of data
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<Object> ar2 = new ArrayList<Object>();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(null);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		ar.add(400);
		ar.add(400);
		ar1.add(null);
		ar1.add(" ");
		System.out.println(ar1.get(0));
		System.out.println(ar1.get(1));
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		//System.out.println(ar.get(5));
		//System.out.println(ar.get(-1));
		
//		ar.remove(2);
//		
//		System.out.println(ar.get(2));
//		System.out.println(ar.size());
		
		//get the values
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
