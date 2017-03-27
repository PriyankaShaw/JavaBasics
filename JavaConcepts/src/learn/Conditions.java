package learn;

import java.util.Scanner;

public class Conditions {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number");
		int no=in.nextInt();
		if(no%2==0){
			System.out.println(no+" is even.");
		}else{
			System.out.println(no+" is odd.");
		}
	}
	
}
