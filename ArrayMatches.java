package Module3;

public class ArrayMatches {

	public static void main(String[] args) 
	{
		String s1="Dolby";
		  // Given string consist of 5 letters are not
		boolean b1=s1.matches(".....");
		System.out.println(b1);
		 // String starts with D
		boolean b2=s1.matches("D(.*)");
		System.out.println(b2);
		  // String ends with a
		boolean b3=s1.matches("(.*)e");
		System.out.println(b3);
		
		String s2="Salman Khan";
		 // string contains man or not
		boolean b4=s2.matches("(.*)man(.*)");
		System.out.println(b4);

	}

}
