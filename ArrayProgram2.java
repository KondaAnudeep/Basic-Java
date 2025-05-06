package Module3;
  //One Array into another Array in reverse.
import java.util.Arrays;

public class ArrayProgram2 
{

	public static void main(String[] args) 
	{
		String[]input=new String[4];
		input[0]="Anu";
		input[1]="Sun";
		input[2]="Don";
		input[3]="Frank";
		
		String[]output=new String[4];
		for(int i=3,j=0;i>=0;i--,j++)
		{
			output[j]=input[i];
		}
		System.out.println("Input Array ----> "+Arrays.toString(input));
		System.out.println("Output Array --->"+Arrays.toString(output));

	}

}
