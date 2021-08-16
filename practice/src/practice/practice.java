package practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		input.close();
		System.out.println((num % 2 == 0) ? "Even" : "Odd");
	}
}
