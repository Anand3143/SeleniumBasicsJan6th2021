package SeleniumPracticeJan6th;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		//Hashtable ht1 = new Hashtable();
		ht1.put(101, "John");
		ht1.put(102, "David");
		ht1.put(103, "Smith");
		ht1.put(104, "John");
	//	ht1.put(null, "X");
	//	ht1.put(106, null);	
		System.out.println(ht1);
		System.out.println(ht1.get(102));
		System.out.println(ht1.remove(104));
		System.out.println(ht1);
		System.out.println(ht1.contains(105));
		System.out.println(ht1.containsValue("Smith"));
		System.out.println(ht1.isEmpty());
		System.out.println(ht1.keySet());
		System.out.println(ht1.values());
		
		for(int k:ht1.keySet())
		{
			System.out.println(k+" "+ht1.get(k));
		}
	}

}
