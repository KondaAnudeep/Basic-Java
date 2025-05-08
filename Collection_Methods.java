package Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Methods 
{

	public static void main(String[] args) 
	{
		Collection<String>s1=new ArrayList<String>();
		s1.add("Leo");
		s1.add("Libra");
		s1.add("Scorpio");
		s1.add("Virgo");
		System.out.println(s1);
		
		Collection<String>s2=new ArrayList<String>();
		s2.add("Aries");
		s2.add("Capricon");
		s2.add("Gemini");
		s2.add("Cancer");
		System.out.println(s2);
		s2.addAll(s1);
		System.out.println(s2);
		
		boolean b1=s2.contains("Pisces");
		System.out.println(b1);
		boolean b2=s2.containsAll(s1);
		System.out.println(b2);
		
		s2.remove("Cancer");
		System.out.println(s2);
		s2.removeAll(s1);
		System.out.println(s2);
		
		boolean b3=s2.isEmpty();
		System.out.println(b3);
		
		int count=s2.size();
		System.out.println(count);
				
		
		boolean b4=s2.equals(s1);
		System.out.println(b4);
		
		s2.clear();
		System.out.println(s2);
		
	
		
	}

}
