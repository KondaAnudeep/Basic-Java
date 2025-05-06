package Module3;
// Iterator
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod2 
{

	public static void main(String[] args) 
	{
		Collection<String>s1=new ArrayList<String>();
		s1.add("Leo");
		s1.add("Libra");
		s1.add("Scorpio");
		s1.add("Virgo");
		System.out.println(s1);
		Iterator<String> a1=s1.iterator();
		while(a1.hasNext())
		{
			System.out.println(a1.next());
		}

	}

}
