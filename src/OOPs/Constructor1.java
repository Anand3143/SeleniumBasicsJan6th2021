package OOPs;

public class Constructor1 {

	int x;
	int y;
	
	Constructor1() //default constructor
	{
		x=20;
		y=10;
	}
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String args[])
	{
		Constructor1 c1 = new Constructor1();
		
		c1.display();
		
	}
}
