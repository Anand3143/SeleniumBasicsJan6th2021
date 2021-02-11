package SeleniumPracticeJan6th;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		// Union, intersection, difference
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(10);
		hs1.add(3);
		hs1.add(15);
		System.out.println(hs1);
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(20);
		hs2.add(30);
		hs2.add(3);
		System.out.println(hs2);
		
		//union
		hs1.addAll(hs2);
		System.out.println("Union : " +hs1);
		
		//intersection
		hs1.retainAll(hs2);
		System.out.println("Intersection : " +hs1);
		
		//difference
		hs1.removeAll(hs2);
		System.out.println("Difference : " +hs1);

		//Subset
		hs1.containsAll(hs2);
		System.out.println("Subset : " +hs1);
	}

}
