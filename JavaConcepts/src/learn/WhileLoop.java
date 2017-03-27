package learn;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int i = 1;
		while (i != 0) {
			System.out.println("Enter 0 to stop");
			i = in.nextInt();
		}
	}
}
