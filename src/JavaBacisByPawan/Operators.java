package JavaBacisByPawan;

public class Operators {
	
	public static void main(String args[])
	{
	
	int a, b; //declaration
	a=10; b=20; //initialization
	
	System.out.println(a==b); //false
	System.out.println(b!=a); //true
	System.out.println(a<b);  //true
	System.out.println(a>b);  //false
	System.out.println(a<=b); //true
	System.out.println(a>=b); //false
	
	System.out.println("  ");
	
	boolean x=false;
	boolean y=false;
	
	System.out.println(x && y); //false
	System.out.println(x || y); //true
	System.out.println(!x);     //false
	System.out.println(!y);     //true
	
	
	//increment/decrement
	
	int c = 10;
	c++;   //c=c+1
	System.out.println(c);
	int d=10;
	d--;
	System.out.println(d);
	
	
	

	}

}
