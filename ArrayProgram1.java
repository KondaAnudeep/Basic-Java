package Module3;
   //One Array into another.Assign 78
import java.util.Arrays;

public class ArrayProgram1 
{

	public static void main(String[] args)
	{
	
		String[]input=new String[4];
		input[0]="Anu";
		input[1]="Sun";
		input[2]="Don";
		input[3]="Frank";
		
		String[]output=new String[4];
		for(int i=0;i<4;i++)
		{
		output[i]=input[i];
		}
		
		System.out.println("Input Array is ---> "+Arrays.toString(input));
		System.out.println("Output Array is ---> "+Arrays.toString(output));

			

	}

}
