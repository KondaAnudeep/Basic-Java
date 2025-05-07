package Practice;

public class Strings1 
{
	

	public static void main(String[] args) 
	{
		String a="School";
		int a1=a.length();
		System.out.println(a1);
		
		String e="       ANUDEEP RAJ          ";
		System.out.println(e);
		String e1=e.trim();
		System.out.println(e1);
		
		String b="Computer";
		boolean b1=b.equals("Computer");
		System.out.println(b1);
		
		String c="Computer ";
		boolean c1=c.equals("computer");
		System.out.println(c1);
		
		String d="Veera Venkat Satya Narayana";
		boolean d1=d.contains("venkat");
		System.out.println(d1);
		
		System.out.println(b.substring(4));
		System.out.println(d.substring(4, 18));  // count starts from zero
		
		int f1=d.indexOf('a');
		System.out.println(f1);
		
		int g1=d.lastIndexOf('n');
		System.out.println(g1);
		
		System.out.println(c.repeat(5));
		
		String z="";
		boolean z1=z.isEmpty();
		System.out.println(z1);
		
		
		


	}

}
