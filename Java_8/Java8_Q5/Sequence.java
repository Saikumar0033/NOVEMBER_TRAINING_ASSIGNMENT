package Java8_Q5;

import java.util.Scanner;

/* User will enter following sequences 1,2,3,4,6,7,8,11,13,14,15,19,20,21. 
You have to generate following output.
1-4,6-8,11,13-15,19-21. */
public class Sequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sequence: ");
		String str = sc.next();

		CheckSeq cs = (s) -> {
			String[] se = s.split(",");
			int temp = Integer.parseInt(se[0]), n, flag = 0;
			System.out.print(temp);
			for (int i = 1; i < se.length; i++) {
				n = Integer.parseInt(se[i]);
				if (temp + 1 == n) {
					temp = temp + 1;
					// System.out.println(n);
					flag++;
				} else {
					if (flag > 0) {
						System.out.print("-" + temp + ",");
						flag = 0;
						temp = n;
						System.out.print(temp);
					} else {
						temp = n;
						System.out.print("," + temp);
					}

				}

				if (i == se.length - 1) {
					if (flag > 0) {
						System.out.println("-" + temp);
					} else {
						System.out.println("," + temp);
					}
				}
			}
		};
		cs.print(str);
	}

}

@FunctionalInterface
interface CheckSeq {
	abstract void print(String s);
}