package Assigh;

import java.util.ArrayList;
import java.util.Scanner;


public class ZNumberDemo {
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		char[]  characters;
		String input = s1.nextLine();
		char[] b;
		b = input.toCharArray();
		String a="";

		for(int i=0;i<b.length;i++)
		{
			if(b[i]== ',')
			{
				continue;
			}
			else
				a = a + b[i];
		}

		characters = a.toCharArray();

		ZNumber z1 = new ZNumber(characters);

		ZNumber z2 = new ZNumber('A','B','C','D');

		ZNumber z3 = new ZNumber("ABCD");

		ZNumber z4 = new ZNumber(new char[]{'A','B'});

		ZNumber z5 = new ZNumber("ABCDEF");

		ZDigit A = new ZDigit('A');
		ZDigit B = new ZDigit('B');
		ZDigit C = new ZDigit('C');
		ZDigit D = new ZDigit('D');

		ZNumber z6 = new ZNumber(A,B,C,D);

		ArrayList<ZDigit> arr= new ArrayList<ZDigit>();
		arr.add(new ZDigit('A'));
		arr.add(new ZDigit('B'));
		ZNumber zn1 = new ZNumber(arr);
		
		System.out.println(z1.toString());
		s1.close();
		z1.toDecimal(z1.toString());

		System.out.println(z2.toString());
		z2.toDecimal(z2.toString());

		System.out.println(z3.toString());
		z3.toDecimal(z3.toString());

		System.out.println(z4.toString());
		z4.toDecimal(z4.toString());

		System.out.println(z6.toString());
		z6.toDecimal(z6.toString());
		
		System.out.println(zn1.toString());
		zn1.toDecimal(zn1.toString());

		ZDigit[] z = z5.getDigits();

		for(int i=0;i<z5.characters.length;i++)
		{
			System.out.println(z[i].ch);

		}
	}
}



