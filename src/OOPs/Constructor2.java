package OOPs;

public class Constructor2 {
	
	int x;
	int y;
	
	Constructor2(int a, int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x/y);
	}
	public static void main(String args[])
	{
		Constructor2 c2 = new Constructor2(10, 4);
		c2.display();
	}
	

}
