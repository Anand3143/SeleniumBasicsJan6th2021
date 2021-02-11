package SeleniumPracticeJan6th;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// declaring heterogenous and homogenous data
		
		LinkedList ll1 = new LinkedList();
		//LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add("Anand");
		ll1.add(25);
		ll1.add(9.002);
		ll1.add('C');
		ll1.add(true);
		ll1.add(null);
		System.out.println(ll1);
		System.out.println(ll1.size());
		ll1.remove(4);
		System.out.println(ll1);
		ll1.remove(3);
		System.out.println(ll1);
		ll1.remove(null);
		System.out.println(ll1);
		ll1.set(2, 0.00);
		System.out.println(ll1);

	}

}
