package SeleniumPracticeJan6th;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// HashSet
		
		HashSet hs1 = new HashSet();//default capacity is 16, load factor is 0.75
		
		//HashSet hs2 = new HashSet(100); //initial capacity is 100
		
		HashSet<Integer> hs3 = new HashSet<Integer>();
		
		hs1.add(100);
		hs1.add("Anand");
		hs1.add(9.001);
		hs1.add(null);
		hs1.add('V');
		hs1.add(true);
		System.out.println(hs1);

		hs1.remove(9.001);
		System.out.println(hs1);
		System.out.println(hs1.contains("Anan"));
		System.out.println(hs1.isEmpty());
		
		//for each loop
		for(Object e:hs1)
		{
			System.out.println(e);
		}
		Iterator it1 = hs1.iterator();
		while(it1.hasNext())	
		{
			System.out.println(it1.next());
		}
		
		hs3.add(2);
		hs3.add(4);
		hs3.add(6);
		System.out.println(hs3);
		
		HashSet<Integer> hs4 = new HashSet<Integer>();
		
		hs4.addAll(hs3);
		System.out.println(hs4);
		hs4.add(10);
		System.out.println(hs4);
		hs4.removeAll(hs3);
		System.out.println(hs4);
		
		
		
		
		}
	}


