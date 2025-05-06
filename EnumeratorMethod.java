package Module3;

import java.util.Enumeration;
import java.util.Vector;

//Assignment100
public class EnumeratorMethod 
{

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.addElement("Through");
		v1.addElement("Goes");
		v1.addElement("Hamilton");
		v1.addElement('L');
		v1.addElement(44);
		System.out.println(v1);
		
		Enumeration e1=v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		

	}

}
