import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Encryption2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new FileReader("/home/zemoso012/p059_cipher.txt"));
		String s = br.readLine();

		char[] array = s.toCharArray();

		/*int i;

		for( i =0 ; i< array.length ;i++)
		{
			if (array[i] == ',')
			{
				i++;
			}
			else continue;
		}
		System.out.println(i);
		int z = i+1;
		System.out.println("Hence the number of integers is "+  z);
		 */
		
		List<Integer> list = new ArrayList();
		List<StringBuilder> list1 = new ArrayList();

		int j;
		for(j=0; j<array.length; )
		{
			String s1 = "";

			while(array[j] != ',')
			{
				s1 = s1 + array[j];
				j++;

				if(j == (array.length ))
				break;
			}

			j++;
			int k = Integer.parseInt(s1);
			list.add(k);
		}

		/*System.out.println(j);
		System.out.println(z);*/


		for(int p=0;p<list.size();p++)
		{
			System.out.println(list.get(p));

		}
		
		System.out.println(list.size());
		int a,b,c;
		char u,v,w,x;

		StringBuilder sb = new StringBuilder();
		for(a=97 ; a <= 122 ; a++)
		{
			for(b = 97 ; b <= 122 ; b++)
			{
				for(c = 97 ; c <= 122 ; c++)
				{
					for(int q=0 ; q < 1200 ; q=q+3)
					{
						u = (char)(a ^ list.get(q)) ;
						v = (char)(b ^ list.get(q+1)) ;
						w = (char)(c ^ list.get(q+2)) ;

						sb.append(""+u+v+w);

						if(q ==1197)
						{
							x = (char)(a ^ list.get(1200));
							sb.append("" + x);
						}
					}

					int sum = 0 ;
					if(sb.indexOf(" the ")>=0)
					{
						for(int l=0 ; l < 1201 ; l++)
						{
							sum += sb.charAt(l); 
						}
						
						System.out.println(sum);
						System.out.println(sb);
					}
					
					list1.add(sb);
					sb=new StringBuilder("");

				}
			}
		}
	}
}


