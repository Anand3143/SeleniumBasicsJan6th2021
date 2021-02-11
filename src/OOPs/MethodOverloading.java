package OOPs;

public class MethodOverloading {

	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, String b)
	{
		System.out.println(a+b);
	}
	void add(int a, String b, double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);
		mo.add(10, " Anand");
		mo.add(10, "Raj", 0.234);
	}
}
