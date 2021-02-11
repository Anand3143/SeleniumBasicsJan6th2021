package JavaBacisByPawan;

public class ArrayEvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// printing Even and Odd number form an array
		
		int arr[] = {2,3,10,4,6,7,99};
		System.out.println(arr.length);
		for(int i=0;i<=arr.length;i++)
			
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even number : " +arr[i]);
			}
			if(arr[i]%2!=0)
			{
				System.out.println("Odd numbers : " +arr[i]);
			}
		}

	}

}
