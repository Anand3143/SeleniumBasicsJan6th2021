package OOPs;

public class ClassObjects {
	
	int eid;
	String ename;
	double esal;
	String edegn;
	String eloc;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(edegn);
		System.out.println(eloc);
		System.out.println();
	}
	
	public static void main(String args[])
	{
		ClassObjects emp1 = new ClassObjects();
		
		emp1.eid=1010;
		emp1.ename="Anand";
		emp1.esal=55000;
		emp1.edegn="Automation Tester";
		emp1.eloc="Banglore";
		emp1.display();
		
		ClassObjects emp2 = new ClassObjects();
		
		emp2.eid=1020;
		emp2.ename="Shankar";
		emp2.esal=38905;
		emp2.edegn="Senior Tester";
		emp2.eloc="Banglore";
		emp2.display();
		
	}

}
