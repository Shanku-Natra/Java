package Patterns;
public class pattern_59 {
	public static void main(String[] args) {
		int x=9;
		for(int i = 1; i <= 5; i++) // 5 rows -> 1 2 3 4 5 
		{
			for( int j = 1; j < i; j++) // 0 1 2 3 4  spaces
			{
				System.out.print(" ");
			}
			for(int n=1; n <= x;n++) // 9 7 5 3 1 times
			{
				System.out.print("*");				
			}
			x = x-2; // x= 7, 5, 3, 1
			System.out.println();
		}
		}
	}

