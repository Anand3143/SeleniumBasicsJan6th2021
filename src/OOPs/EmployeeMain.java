package OOPs;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(); //creating objects
		
		emp1.eid=101;
		emp1.ename="Anand Raj";
		emp1.esal=56000;
		emp1.ejob="QA Engineer";
		emp1.eloc="Benguluru";
		
		
		emp1.display();
		
		Employee emp2 = new Employee(); 
		
		emp2.eid=201;
		emp2.ename="Srikanth";
		emp2.esal=36000;
		emp2.ejob="Senior Tester";
		emp2.eloc="Banglore";
		
		emp2.display();
			
				
		

	}

}
