package OOPs;

public class StudentExample {
	
	int sid;
	String sname;
	int s1;
	int s2;
	int s3;
	
	void idname(int id, String name)
	{
		System.out.println(id + " " +name);
	}
	void stumarks(int sub1, int sub2, int sub3)
	{
		System.out.println(sub1+ " " +sub2+ " " +sub3);
	}
	int total(int sub1, int sub2, int sub3)
	{
		s1=sub1;
		s2=sub2;
		s3=sub3;
		return (s1+s2+s3);
	}
	
	public static void main(String args[])
	{
		StudentExample stu1 = new StudentExample();
		stu1.idname(101, "Anand");
	
		StudentExample stu2 = new StudentExample();
		stu2.stumarks(80, 99, 100);
		
		StudentExample stu3 = new StudentExample();
		int res = stu3.total(80, 99, 100);
		stu1.idname(101, "Anand");
		System.out.println(res);
		}

}
