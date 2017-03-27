package learn;

import java.util.Scanner;

public class IfLoop {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int no=in.nextInt();
		for(int i=1;i<11;i++){
			System.out.println(no+" X "+i+" = "+(no*i));
		}
	}
	
}
