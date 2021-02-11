package OOPs;

public class Method1 {
	
	//not taking parameter and not returning any values
	
	int a = 10;
	int b = 20;
	//case1
	void sum()
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		Method1 m1 = new Method1();//object
		m1.sum();
				
	}

}
