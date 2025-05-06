package Module3;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionMethods1
{
    public static void main(String[] args) 
    {
		Collection<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(14);
		a1.add(16);
		a1.add(36);
		System.out.println(a1);
		a1.remove(36);
		System.out.println(a1);
		boolean b1=a1.contains(36);  // remaining are in practice package. like addall etc.,
		System.out.println(b1);
		
		Collection<String>s1=new ArrayList<String>();
		s1.add("Leo");
		s1.add("Libra");
		s1.add("Scorpio");
		s1.add("Virgo");
		System.out.println(s1);
		s1.remove("Scorpio");
		System.out.println(s1);
		boolean b2=s1.contains("Libra");
		System.out.println(b2);
		
		Collection<Character>c1=new ArrayList<Character>();
		c1.add('A');
		c1.add('K');
		c1.add('R');
		System.out.println(c1);
		c1.remove('R');
		System.out.println(c1);
		boolean b3=c1.contains('M');
		System.out.println(b3);
		
		

	}

}
