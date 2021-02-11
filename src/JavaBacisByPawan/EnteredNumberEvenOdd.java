package JavaBacisByPawan;

import java.util.Scanner;

public class EnteredNumberEvenOdd {

	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = read.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even ");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
