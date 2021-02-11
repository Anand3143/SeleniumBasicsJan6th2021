package Jan6th;

public class throws1{
	

	public static void main(String args[])throws Throwable
	{
		String str1 = "Anand";
		String str2 = "anand";
		
		if(str1.equals(str2))
		{
			System.out.println("String are equal");
		}
		else
		{
			//System.out.println("String are not equal");
			try{
				throw new Exception ("String are not equal");
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}
		
	}
}
