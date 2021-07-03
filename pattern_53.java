package Patterns;
public class pattern_53 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) // 5 rows -> 5 4 3 2 1  
		{
			for( int j = 5; j > i; j--) // 0 1 2 3 4 spaces
			{
				System.out.print(" ");
			}
			for(int n=1; n <= i;n++) // 5 4 3 2 1 times
			{
				System.out.print( (char)(i+64)+" ");
			}
			System.out.println();
		}
	}
}
