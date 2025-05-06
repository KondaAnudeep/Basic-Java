package Module3;
 // Assignment 66 also
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ArrayRunTime1{
    public static void main(String[] args) {
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Size of Array------> "+s1 );
		String[]Author=new String[s1.nextInt()];
		for(int i=0;i<Author.length;i++){
	     System.out.println("Author"+i);
	     Author[i]=s1.next();
		 }
		System.out.println(Arrays.toString(Author));
		s1.close();
		}
		catch(NegativeArraySizeException a1){
			System.out.println("Size of Array can't be Negative only Positive");
		}
		try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Size of Array------> "+s1 );
		String[]Author=new String[s1.nextInt()];
		for(int i=0;i<Author.length;i++){
	     System.out.println("Author"+i);
	     Author[i]=s1.next();
		 }
		System.out.println(Arrays.toString(Author));
		s1.close();
		}
		catch(InputMismatchException b1){
			System.out.println("Size of Array can't be other then int");
		}
		Scanner s1=new Scanner(System.in);
		System.out.println("Size of Array------> "+s1 );
		String[]Author=new String[s1.nextInt()];
		for(int i=0;i<Author.length;i++){
	     System.out.println("Author"+i);
	     Author[i]=s1.next();
		 }
		System.out.println(Arrays.toString(Author));
		s1.close();
		}

	}


