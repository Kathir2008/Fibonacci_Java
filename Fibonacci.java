package fibonacci;
import java.util.*;

public class Fibonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = input.nextInt();
		int first = 0;
		int second = 1;
		for(int i=1;i<=number;i++)
		{
			System.out.print(first+",");
			int third = first + second;			
			first = second;
			second = third;
		}
	}

}
