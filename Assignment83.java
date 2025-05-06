package Module3;

public class Assignment83
{
	static int countofalpha=0;  // this is global variable.
	static int countofnumeric=0;
	static int countofspace=0;

	public static void main(String[] args)
	{
		String a="Anudeep Raj @14 4";
		char[] a1=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			boolean c1=Character.isAlphabetic(a1[i]);
			boolean c2=Character.isDigit(a1[i]);
			boolean c3=Character.isWhitespace(a1[i]);
			
			if(c1==true)
			{
				countofalpha++;
			}
			if(c2==true)
			{
				countofnumeric++;
			}
			if(c3==true)
			{
				countofspace++;
			}
		}
		System.out.println("count of Alphabets---->"+countofalpha);
		System.out.println("count of Numerics------>"+countofnumeric);
		System.out.println("count of Space-------->"+countofspace);
		int countofspecialchar=a.length()-(countofalpha+countofnumeric+countofspace);
		System.out.println("count of special charcter------>"+countofspecialchar);

	}

}
