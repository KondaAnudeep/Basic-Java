package Module3;

import java.util.Arrays;

//Arrays.toString and Arrays.sort concept
public class Assignment80 
{

	public static void main(String[] args) 
	{
		String name[]=new String[3];
		name[0]="listen";
		name[1]="silent";
		name[2]="super man";
		
		for(int i=0;i<name.length;i++)
		{
			
		}
		System.out.println(Arrays.toString(name));
		if(name[0].length()!=name[1].length())
		{
			System.out.println("They are not Anagram");
		}
		else
		{
			char c1[]=name[0].toCharArray();
			char c2[]=name[1].toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b1=Arrays.equals(c1, c2);
			   if(b1==true)
			   {
				   System.out.println("Given 2 strings are Anagram");
			   }
			   else
			   {
				   System.out.println("Given 2 strings are not Anagram");
			   }
			
		}

	}

}
