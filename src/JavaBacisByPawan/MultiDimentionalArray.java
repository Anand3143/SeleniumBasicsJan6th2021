package JavaBacisByPawan;

public class MultiDimentionalArray {

	public static void main(String args[])
	{
		int a[][] = new int[3][2];
		//insert values
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
 		
		System.out.println(a[2][1]);
		System.out.println(a.length);
		
		int b[][] = { {10,20},{30,40},{50,60},{70,80}   };
		System.out.println(b.length);
		System.out.println(b[0].length);
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		System.out.println(b[0].length);
		System.out.println("enhanced for loop");
		//multi dimensional enhanced for loop
		for (int c[]:b)
		{
			for(int d:c)
			{
				System.out.println(d);
			}
		}
		
	}
}
