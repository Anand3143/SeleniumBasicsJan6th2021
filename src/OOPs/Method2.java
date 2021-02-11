package OOPs;

public class Method2 {
	
	//not taking parameter and returning values
	
	int a = 10;
	int b = 20;
	 
	//case2
	
	int sum()
	{
		return(a*b);
	}
	
	public static void main(String args[])
	{
		Method2 m2 = new Method2();
		int result = m2.sum();
		System.out.println(result);
		
	}

}
