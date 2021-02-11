package OOPs;

public class Method4 {
	
	//taking parameters and returning values
	
	int sum(int a, int b)
	{
		return (a-b);
	}
	public static void main(String args[])
	{
		Method4 m4 = new Method4();
		int res = m4.sum(10, 11);
		System.out.println(res);
	}

}
