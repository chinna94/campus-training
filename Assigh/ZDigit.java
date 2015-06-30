package Assigh;

public class ZDigit {

	int rank;
	char ch;

	public ZDigit( char ch ){


		if(Character.isUpperCase(ch))
		{	
			this.ch = ch;
			rank = (int)ch - 'A' + 1 ;
		}
		else if(ch =='0')
		{	
			this.ch = ch;
			rank = (int)ch -'A' +17;
		}	


		else throw new IllegalArgumentException("Please enter the Character Between A-Z or 0");

	} 
}




