package Module3;
//List Concepts(92)
import java.util.ArrayList;
import java.util.List;
public class CollectionMethod3 
{
    public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(62);
		l1.add(78);
		l1.add(69);
		System.out.println(l1);
		
		l1.add(99);
		System.out.println(l1);

		
		boolean b1=l1.contains(36); 
		System.out.println(b1);
		
		l1.remove(4);
		System.out.println(l1);
		
		boolean b2=l1.isEmpty();
		System.out.println(b2);
		
		l1.clear();
		System.out.println(l1);
		
		

		
	}

}
