package OOPs;

public class Constructor {
	
	int sid;
	String sname;
	char grade;
	
	Constructor(int id, String name, char g) //constructor
	{
		sid = id;
		sname = name;
		grade = g;
	}
	void display()
	{
		System.out.println(sid+ " " +sname+ " " +grade);
	}
	

}
