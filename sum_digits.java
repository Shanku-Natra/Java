package Numbers;
import java.util.*;
public class Sum_digits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); // 1234
		int sum= 0 , rem ;
		while(n != 0) // n= 1234, 123 , 12 , 1
		{
			rem = n%10; // rem = 1%10 = 1 
			sum = sum + rem; // 10
			n = n/10; //n = 1/10 = 0
		}
	System.out.println("sum of digits = "+sum);
	} }

		
