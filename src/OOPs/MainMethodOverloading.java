package OOPs;



public class MainMethodOverloading {

	public void main(int x)
	{
		System.out.println(x);
		
	}
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}
	public void main(int x, String name, double y)
	{
		System.out.println(x+name+y);
	}
	public static void main(String args[])
	{
		MainMethodOverloading mmo = new MainMethodOverloading();
				mmo.main(10);
				mmo.main(20, 30);
				mmo.main(40, "Anand Raja", 0.025);
	}
}
