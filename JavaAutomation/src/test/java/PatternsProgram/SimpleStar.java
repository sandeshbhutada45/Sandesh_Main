package PatternsProgram;

public class SimpleStar {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) // Row
		{
			for (int j = 1; j <= i; j++)// Coloumn
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
