package SeleniumPracticeJan6th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// Linkedlist using addall method
		
		LinkedList ll2 = new LinkedList();
		
		ll2.add(10);
		ll2.add("Anand");
		ll2.add(8.99);
		
		LinkedList lla = new LinkedList();
		lla.addAll(ll2);
		System.out.println(lla);
		//Collections.sort(lla);
		
		LinkedList ll3 = new LinkedList();
		ll3.add("dog2");
		ll3.add("dog3");
		ll3.add("dog1");
		System.out.println(ll3);
		Collections.sort(ll3);
		System.out.println(ll3);
		Collections.reverse(ll3);
		System.out.println(ll3);
		Collections.shuffle(ll3);
		System.out.println(ll3);
		ll3.addFirst("elephant");
		ll3.addLast("pandi");
		System.out.println(ll3);
		
		/*lla.removeAll(ll2);
		System.out.println(lla);
		
		ArrayList al5 = new ArrayList();
		al5.add("Anand");
		al5.add("Anand");
		System.out.println(al5);*/
		

	}

}
