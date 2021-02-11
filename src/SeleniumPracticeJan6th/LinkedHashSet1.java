package SeleniumPracticeJan6th;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// LinkedHashSet
		
		LinkedHashSet lhs1 = new LinkedHashSet();
		//LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>();
		
		lhs1.add(100);
		lhs1.add(200);
		lhs1.add(300);
		lhs1.add(400);
		lhs1.add(500);
		lhs1.add(100);
		
		System.out.println(lhs1);
		

	}

}
