package Patterns;
public class pattern_47 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) // 5 rows -> 5 4 3 2 1 
		{
			for( int j = 5; j > i; j--) // cols -> 0 1 2 3 4 spaces
			{
				System.out.print(" ");
			}
			for(int n=1; n <= i;n++) // cols -> 5 4 3 2 1 stars
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
