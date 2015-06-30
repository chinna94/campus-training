package Assigh;

import java.util.Scanner;


public class ZDigitDemo {
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char c = (char)s.charAt(0);
		ZDigit z = new ZDigit(c);
		scanner.close();


	}
}