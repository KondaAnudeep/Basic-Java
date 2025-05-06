package Module3;
  // Averages of all Values in Array
public class ArrayProgram3
{

	public static void main(String[] args) 
	{
		int sum=0;
		int xo[]=new int[4];
		xo[0]=54;
		xo[1]=87;
		xo[2]=21;
		xo[3]=32;
		 
		for(int i=0;i<4;i++)
		{
			sum=sum+xo[i];
		}
		System.out.println(sum);
		double average=sum/xo.length;
		System.out.println(average);
				

	}

}
