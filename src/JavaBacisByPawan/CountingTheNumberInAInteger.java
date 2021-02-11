package JavaBacisByPawan;

public class CountingTheNumberInAInteger {
	
	public static void main(String args[])
	{
		int i=323, count = 0;
		
		while(i!=0)
		{
		
		i = i/10;
		++count;
		}
		System.out.println("Number of digits are: " +count);
		
	}

}
