package OOPs;

public class ThisKeyword {

	int a,b;  //instance variable or class variable
	void getValues(int a, int b) //Method variables or external variable
	{
		/*a=a;
		b=b; */
		this.a=a;
		this.b=b;
	}
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[]){
	ThisKeyword th = new ThisKeyword();
	
	th.getValues(10, 11);
	th.printValues();
	}
}
