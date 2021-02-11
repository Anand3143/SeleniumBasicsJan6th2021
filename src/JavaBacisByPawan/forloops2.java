package JavaBacisByPawan;

public class forloops2 {

	public static void main(String args[])
	{
		/*for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i); // 1 2 3 4
		}*/
		
		for(int i=1;i<10;i++)
		{
			if(i==5)   // i==5 || i==7 ----skip these numbers
			{
				continue;
			}
			System.out.println(i); // it will skip the 5 
		}
	}
}
