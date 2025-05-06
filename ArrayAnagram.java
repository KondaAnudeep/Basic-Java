package Module3;

import java.util.Arrays;

public class ArrayAnagram 
{

	public static void main(String[] args) 
	{
		String s1="SILENT";
		String s2="LISTEN";
		if(s1.length()!=s2.length()) 
		{
			System.out.println("They are not Anagram");
		}
		else
		{
			char c1[]=s1.toCharArray(); //[S,I,L,E,N,T]
			char c2[]=s2.toCharArray();  //[L,I,S,T,E,N]
			
			Arrays.sort(c1);  //[E,I,L,N,S,T]
			Arrays.sort(c2);  //[E,I,L,N,S,T]
			
			boolean b1=Arrays.equals(c1, c2);
			    if(b1==true)
			    {
			    	System.out.println("Given 2 strings are Anagram");
			    }
			    else
			    {
			    	System.out.println("Given 2 Strings are not Anagram");
			    }
		}
				

	}

}
