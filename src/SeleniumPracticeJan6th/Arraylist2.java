package SeleniumPracticeJan6th;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		// 
		
		ArrayList al1 = new ArrayList();
		al1.add('X');
		al1.add('A');
		al1.add('R');
		
		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		System.out.println(al2);
		Collections.sort(al1);
		System.out.println(al1);
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);
		Collections.shuffle(al1);
		System.out.println(al1);

	}

}
