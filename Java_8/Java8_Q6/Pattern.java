package Java8_Q6;

import java.util.Scanner;

/*User will enter middle character in above case user has entered F 
and you printed above pattern. If user enter G pattern will look 
like following 
ABCDEFGFEDCBA and so on*/
public class Pattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Letter to print the pattern");
		String str = sc.next().toUpperCase();
		char ch = str.charAt(0);
        int row = ch - 65;
		PatternInterface p = (r) -> {
			System.out.println("Print pattern: " + (r));

			int alphabet = 65;
			for (int i = 0; i <= row; i++) {

				for (int j = 0; j <= row - i; j++) {
					System.out.print((char) (alphabet + j));
				}

				for (int k = 1; k <= i * 2 - 1; k++) {
					System.out.print(" ");
				}

				for (int l = row - i; l >= 0; l--) {

					if (l != row)
						System.out.print((char) (alphabet + l));
				}
				System.out.println();
			}

		};
		p.displayPattern(row);
	}
}

@FunctionalInterface
interface PatternInterface {
	public void displayPattern(int r);
}
