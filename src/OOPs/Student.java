package OOPs;

public class Student {
	
	//by using the method
	
	int sid;
	String sname;
	char sgrade;
	
	void getValues(int id, String name, char g)
	{
		sid = id;
		sname = name;
		sgrade = g;
	}
	
	void display()
	{
		System.out.println(sid + " " +sname +" " +sgrade );
		System.out.println();
	}
	
	

}
