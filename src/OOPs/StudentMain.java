package OOPs;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		stu.getValues(101, "Anand", 'A');
		
		stu.display();
		
		Student stu1 = new Student();
		stu1.getValues(102, "Raj", 'B');
		stu1.display();

	}

}
