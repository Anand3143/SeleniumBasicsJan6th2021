package JavaBacisByPawan;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c=0;
		int count=20;
		System.out.print(a+  " " +b);
		for(int i=0;i<count;++i)
		{
			c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
		}
	}

}
