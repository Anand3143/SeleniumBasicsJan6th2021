package SeleniumPracticeJan6th;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) {
		// converting array to arraylist
		
		String ar[] = {"anand","shankar","Naresh"};
		
		for(String value:ar)
		{
			System.out.println(value);
		}
		
		ArrayList al3 = new ArrayList(Arrays.asList(ar));
		System.out.println(al3);
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Anand");
		al4.add("raj");
		al4.add("nari");
		System.out.println(al4);
	}

}
