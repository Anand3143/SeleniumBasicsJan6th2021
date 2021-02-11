package OOPs;

public class Employee1 {
	
	//by using the reference variable
	
	int eid;
	String ename;
	double esal;
	String ejob;
	String eloc;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(ejob);
		System.out.println(eloc);
		
	}
	void bonus()
	{
		System.out.println("Employee bonus this year  : " +esal*10/100);
		System.out.println();
	}

	public static void main(String[] args){
		
		Employee1 emp1 = new Employee1();
		emp1.eid = 101;
		emp1.ename = "Anand";
		emp1.esal = 12345;
		emp1.ejob = "QA";
		emp1.eloc = "Banglore";
		
		emp1.display();
		emp1.bonus();
		
		Employee1 emp2 = new Employee1();
		emp2.eid = 102;
		emp2.ename = "RAJ";
		emp2.esal = 1234567;
		emp2.ejob = "QE";
		emp2.eloc = "Hebbal";
		
		emp2.display();
		emp2.bonus();
		
	}
}

	
	
		
	


