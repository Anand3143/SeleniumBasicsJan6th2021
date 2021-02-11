package SeleniumPracticeJan6th;

import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.io.filefilter.TrueFileFilter;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.gargoylesoftware.htmlunit.javascript.host.Set;
import com.google.common.collect.Multiset.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// HashMaps
		
		//HashMap hm1 = new HashMap();
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(101, "Anand");
		hm1.put(102, "Raju");
		hm1.put(103, "Shankar");
		hm1.put(104, "Anand");
		hm1.put(105, "Naresh");
		hm1.put(106, "Nari");
		
		System.out.println(hm1);
		System.out.println(hm1.get(105));
		hm1.remove(106);
		System.out.println(hm1);
		System.out.println(hm1.containsKey(106));//true or false
		System.out.println(hm1.containsValue("Anand"));//true or false
		System.out.println(hm1.isEmpty());//true or false
		System.out.println(hm1.keySet());//returns all keys as set
		System.out.println(hm1.values());//returns all values as set
		System.out.println(hm1.entrySet());//returns all entries as sets key and value
		System.out.println(hm1.get(101));
		for(int i:hm1.keySet())
		{
			System.out.println(i);
		}
		for(String i:hm1.values())
		{
			System.out.println(i);
		}
		for(int i:hm1.keySet())
		{
			System.out.println(i+" "+hm1.get(i));
		}
		
		//Entry interface method
	
		/*for(Map.Entry entry:hm1.entrySet())
		{
			entry.getkey+" "entry.getvalue
		}*/
		
		
	}

}
