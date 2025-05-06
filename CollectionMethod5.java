package Module3;
  //Assignment 94
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionMethod5 {

	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(62);
		l1.add(78);
		l1.add(69);
		System.out.println(l1);
		
		ListIterator<Integer> i2=l1.listIterator();
		System.out.println("ListIteration in Forward");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("ListIteration in Backward");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
