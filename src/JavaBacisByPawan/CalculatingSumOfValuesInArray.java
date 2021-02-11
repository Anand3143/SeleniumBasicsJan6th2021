package JavaBacisByPawan;

public class CalculatingSumOfValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calculating sum of the values in a array
		
		int a[] = new int[5];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 5;
		a[3] = 7;
		a[4] = 10;
		
		int k=0;
		System.out.println(a[3]);
		//System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		for(int j=0;j<=a.length;j++)
		{
		k= k+a[j];	
		System.out.println(k);
		}
		
		
		
		
		
		
		/*int arr[] = {10,4,5};
		System.out.println(arr[0]+arr[1]+arr[2]);
		System.out.println(arr.length);
		for(int i=0;i<=arr.length; i++)
		{
			
		}*/
				

	}

}
