package JavaBacisByPawan;

public class AddingTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[][] = { {12,23},{44,56},{11,89} };
		int arr2[][] = { {11,22},{22,44},{55,77} };
		System.out.println(arr1.length + " " +arr2.length);
		System.out.println(arr1[0].length + " " + arr2[0].length);
		
		System.out.print((arr1[0][0] + arr2[0][0]));
		System.out.println(arr1[0][1] + arr2[0][1]);
		
		System.out.print((arr1[1][0] + arr2[1][0]));
		System.out.println(arr1[1][1] + arr2[1][1]);
		
		System.out.print((arr1[2][0] + arr2[2][0]));
		System.out.println(arr1[2][1] + arr2[2][1]);
		
		
		for(int i=0;i<=arr1.length;i++)
		{
			for(int j=0;j<=arr1[i].length;j++)
			{
				//System.out.println(arr1[i][j]);
			
			
		
		for(int k=0;k<=arr2.length;k++)
		{
			for(int l=0;l<=arr2[k].length;l++)
			{
				//System.out.println(arr2[k][l] + arr1[i][j]);
			}
		}
		
			}
		}
			
	}

}
