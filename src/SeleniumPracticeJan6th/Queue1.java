package SeleniumPracticeJan6th;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		// working on all methods add, offer, element, peek, remove, poll
		
		PriorityQueue pq1 = new PriorityQueue();
		//adding elements add and offer
		
		pq1.add("A");
		pq1.add("K");
		pq1.offer("O");
		pq1.offer("R");
		pq1.offer("R");
		System.out.println(pq1);//insertion order preserved and duplicates allowed
		
		// get head element element() and peek()
		System.out.println(pq1.element());//return head element, if queue is empty returns NoSuchElementException
		System.out.println(pq1.peek());//returns head element, if queue is empty returns Null
		
		//remove and poll
		System.out.println(pq1.remove());//it returns and removes the head element, if queue is empty returns exception
		System.out.println(pq1);
		System.out.println(pq1.poll());//it returns and removes the head element, if queue is empty returns Null
		System.out.println(pq1);

		Iterator it1 = pq1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
