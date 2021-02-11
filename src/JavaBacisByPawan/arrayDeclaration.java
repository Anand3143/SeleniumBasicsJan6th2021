package JavaBacisByPawan;

public class arrayDeclaration {
	
	public static void main(String args[])
	{
		//single dimentional array
		
		/*int a[] = new int[5]; //declaring array with size 5, index starts with 0 and ends with 4
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[1]); */
		
		int a[] = {100,200,300,400,500,600}; //declaraed and values inserted
		
		System.out.println(a.length);
		System.out.println(a[5]);
		
		/* for(int i=0; i<=a.length; i++)
		{
			System.out.println(a[i]);
		} */
		
		//read values from enhanced loop
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	
}
