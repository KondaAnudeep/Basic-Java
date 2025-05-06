package Module3;
//iterate a list(93)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionMethod4 {

	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(62);
		l1.add(78);
		l1.add(69);
		System.out.println(l1);
		Iterator<Integer>i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
