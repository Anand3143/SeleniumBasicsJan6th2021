package JavaBacisByPawan;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r, sum=0, temp;
		int n=1211;
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if (sum==temp) 
		
			System.out.println(" Palindrome number");
		
		else
		
			System.out.println( " not palindrome number");
		
		
		
	}

	}
