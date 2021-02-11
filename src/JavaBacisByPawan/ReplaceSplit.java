package JavaBacisByPawan;

public class ReplaceSplit {

	public static void main(String[] args) {
		// replace replace all, replacefirst, split, reverse
		
		String str1 = "Welcome to Bangalore";
		System.out.println(str1.replace("Welcome", "Hydrabad"));
		System.out.println(str1.replaceAll(str1, "Hello"));
		System.out.println(str1.replaceFirst("We", "Hi"));
		
		String str2 = "I am in Bangalore";
		String x[]= str2.split(" ");
		System.out.println(x[1]);
		
		String str3 = "Anand Raj";
		String reverse = "";
		for(int i=str3.length()-1;i>=0;i--)
		{
			reverse = reverse+str3.charAt(i);
			System.out.println(reverse);
		}

		System.out.println(reverse);
	}

}
