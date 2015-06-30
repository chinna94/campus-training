package Assigh;

import java.util.ArrayList;

public class ZNumber {

	char[] characters;

	public ZNumber(ZDigit... z)
	{
		int n = z.length;
		characters = new char[n];

		for(int i=0;i<n;i++)
		{
			this.characters[i] = z[i].ch;
		}
	}


	public ZNumber(ArrayList<ZDigit> arr ){

		int n = arr.size();
		characters = new char[n];
		
		for(int i=0;i<n;i++)
		{
			characters[i] = arr.get(i).ch;
		}

		for(int i=0;i<characters.length;i++)
		{
			new ZDigit(characters[i]);
		}
	}


	public ZNumber(char... characters)
	{
		this.characters=characters;

		for(int i=0;i<characters.length;i++)
		{
			new ZDigit(characters[i]);
		}
	}


	public ZNumber(String p)
	{
		this.characters= p.toCharArray();

		for(int i=0;i<characters.length;i++)
		{
			new ZDigit(characters[i]);
		}
	}


	public String toString(){
		/*String t = new String(characters1);
	 		return t;*/

		String t = "";

		for(int j=0 ; j < characters.length ; j=j+1)
		{
			t= t+ characters[j];
		}
		return t;
	}


	public void toDecimal(String t){
		char[] arr = t.toCharArray();
		int value = 0;
		int j=1;

		for(int i=arr.length ;i>0 ;i--)
		{	
			if(arr[arr.length-i]== '0')
			{
				int p = (int)arr[arr.length-i]-'A'+17;
				value += Math.pow(26,(arr.length)-j)*p;
				j++;
			}

			else 
			{
				int p = (int)arr[arr.length-i]-'A'+1;
				value += Math.pow(26,(arr.length)-j)*p;
				j++;
			}
		}
		System.out.println("Decimal Value :" + value);
	}


	public ZDigit[] getDigits(){

		ZDigit[] z= new ZDigit[characters.length];

		for(int i=0;i<characters.length;i++)
		{
			z[i] = new ZDigit(characters[i]);
		}
		return z;
	}
}









