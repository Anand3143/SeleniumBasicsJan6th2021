package JavaBacisByPawan;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Length
		String str = "Anand Raj";
		System.out.println("Length of the given string: " +str.length());
		
		//concat
		String str2 = "Hello ";
		String str3 = "Anand";
		System.out.println(str2.concat(str3));
		
		//trim
		String str4 = "  Hi Raj  ";
		System.out.println(str4.trim());
		
		//charAt
		String str5 = "Hello Anand Raj";
		System.out.println(str5.charAt(14));
		
		//contains
		String str6 = "Anand";
		System.out.println(str6.contains("Aanad"));
		
		//equals
		String str7 = "Anand Raj Banglore";
		System.out.println(str7.equals("Anand Raj Banglore"));
		
		//equalsIgnoreCase
		String str8 = "Welcome to Banglore";
		System.out.println(str8.equalsIgnoreCase("welcome to banglore"));
		
		//replace
		String str9="Welcome to Millinnium towers";
		System.out.println(str9.replace('i', 'A'));
		System.out.println(str9.replace("Millinnium", "twin"));
		
		//substring
		String str10 = "WELCOME";
		System.out.println(str10.substring(1, 7));
		
		//tolowercase
		String str11 = "ANAND RAJ";
		System.out.println(str11.toLowerCase());
		
		//touppercase
		String str12 = "anand raja";
		System.out.println(str12.toUpperCase());
		
	}

}
