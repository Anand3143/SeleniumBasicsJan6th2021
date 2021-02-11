package JavaBacisByPawan;

public class ArrayGreatestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//finding greatest and smallest number in an array
		int arr[] = {23,11,56};
		System.out.println(arr.length);
		
		if(arr[0]>=arr[1] && arr[0]>=arr[2])
		{
			System.out.println("greatest is : " +arr[0]);
		}
		else if(arr[1]>=arr[2] && arr[1]>=arr[0])
		{
			System.out.println("greatest is : " +arr[1]);
		}
		else
		{
			System.out.println("greatest is : " +arr[2]);
		}
		if(arr[0]<=arr[1] && arr[0]<=arr[2])
		{
			System.out.println("smallest is : " +arr[0]);
		}
		else if(arr[1]<=arr[2] && arr[1]<=arr[0])
		{
			System.out.println("smallest is : " +arr[1]);
		}
		else
		{
			System.out.println("smallest is : " +arr[2]);
		}
 
	}

}
