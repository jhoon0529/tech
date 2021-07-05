package test01;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayTest {

	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println(arr.getClass());
		System.out.println(arr.hashCode());
		System.out.println(arr.toString());

		for(int x : arr) {
		System.out.println( arrayTest.class.arrayType());	
//			System.out.println(x);
		}
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		
		System.out.println(alist);
//		for (Iterator iterator = alist.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//		}
		for(int y=0;y<alist.size()+1;y++) {
			System.out.println(alist.get(y));
		}
		
	}
}
