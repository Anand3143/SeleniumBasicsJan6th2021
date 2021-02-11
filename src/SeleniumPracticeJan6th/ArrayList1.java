package SeleniumPracticeJan6th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayList1 {

	public static void main(String[] args) {
		// declaring arraylist heterogeneous and homogeneous
		//ArrayList <String> al1 = new ArrayList<String>();
		//ArrayList<String> al1 = new ArrayList<String>();
		ArrayList al2 = new ArrayList();
		//add elements to the arraylist
		al2.add(10);
		al2.add("anand");
		al2.add('C');
		al2.add(9.02);
		al2.add(true);
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println(al2.get(1));
		System.out.println(al2.remove(2));
		System.out.println(al2);
		System.out.println(al2.set(2, 9.005));
		System.out.println(al2);
		System.out.println(al2.isEmpty());
		System.out.println(al2.contains(10));
		al2.add(4, 'A');
		System.out.println(al2);
		//reading one by one from arraylist using for loops
		/*for (int i=0; i<al2.size(); i++)
		{
			//System.out.println(al2);
			System.out.println(al2.get(i));
		}*/
		//for each loop
		for(Object e:al2)
		{
			System.out.println(e);
		}
		//Iterator
		Iterator it	= al2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
