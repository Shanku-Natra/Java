package Patterns;
public class pattern_32 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--) // 5 rows - 5 4 3 2 1
		{
		for (int j=1; j <= i ;j++) // i times
		{
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
		}
	}
}
