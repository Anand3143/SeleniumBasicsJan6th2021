package Jan6th;

public class throwsexample1 {
	public static void main(String args[])
	{
		int i, j,k=0;
		i=8;
		j=0;
		try
		{
			k=i/j;
		}
		//System.out.println(k);
		catch(Exception e)
		{
			System.out.println("cannot divide by zero" + " " + e  );
		}
		System.out.println(k);
	}

}
