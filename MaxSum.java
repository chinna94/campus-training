import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class MaxSum {
	public static void main(String[] args) throws IOException
	{
		String filename = "/home/zemoso012/triangle1.txt";
		Scanner scanner = new Scanner(new File(filename));

		int i=0;//rows
		int j=0;//columns
		int[][] array;//declaration of an two dimensional array

		array = new int[100][0];
		//I have to add integers to integer array

		for(i=0;i<100;i++)
		{

			array[i] = new int[i+1];//initialisation of two dimensional array

			for(j=0 ; j< i+1 ; j++)
			{
				array[i][j] =scanner.nextInt();//Putting values into two dimensional array using scanner object
			}
			//Giving input through scanner object has been done.
		}



		for(i=99 ; i>=0 ; i--)
		{
			for(j=0 ; j < i ; j++)
			{
				if(array[i][j] < array[i][j+1])
				{
					array[i-1][j] = array[i-1][j] + array[i][j+1];
				}
				else
					array[i-1][j] = array[i-1][j] + array[i][j];
			}
		}
		scanner.close();
		System.out.println(array[0][0]);
	}
}
