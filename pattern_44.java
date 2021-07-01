package Patterns;
public class pattern_44 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) // 5 rows -> 5 4 3 2 1
		{
			for( int j = 1; j < i; j++) // 4 3 2 1 0
			{
				System.out.print(" ");
			}
			for(int n=i; n <= 5;n++) // 1 2 3 4 5 times
			{
				System.out.print((char)(n+64));
			}
			System.out.println();
		}
	}
}
