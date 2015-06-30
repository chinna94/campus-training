import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Sudoku4 {
	static int[][]  arr;

	static class Cell
	{
		int row,column;


		public Cell(int row,int column)
		{
			this.row = row;
			this.column = column;
		}

		static boolean isValid(Cell cell,int v)
		{
			if(arr[cell.row][cell.column] != 0)
			{
				throw new RuntimeException("No need to check the validity for the already assigned");
			}

			for(int c=0;c<9;c++)
			{
				if(arr[cell.row][c] == v)
					return false;
			}

			for(int r=0;r<9;r++)
			{
				if(arr[r][cell.column] == v)
					return false;
			}

			int r1 = 3*(cell.row/3);
			int c1 = 3*(cell.column/3);

			int c2 = c1+2;
			int r2 = r1+2;

			for(int c=c1;c<=c2;c++)
			{
				for(int r=r1;r<=r2;r++)
				{
					if(arr[r][c] == v)
					{
						return false;
					}
				}
			}
			return true;

		}

		static Cell getNextCell(Cell cur)
		{
			int row = cur.row ;
			int col = cur.column;

			col++;
			if(col>8)
			{
				col=0;
				row++;
			}
			if(row>8)
			{
				return null;
			}

			Cell next = new Cell(row,col);
			return next;
		}

		static boolean solve(Cell cur)
		{
			if(cur == null)
			{
				return true;
			}
			
			if(arr[cur.row][cur.column] != 0)
			{
				return solve(getNextCell(cur));
			}

			for(int i=1;i<=9;i++)
			{
				boolean valid = isValid(cur,i);

				if(!valid)
					continue;
				arr[cur.row][cur.column] = i;

				boolean solved = solve(getNextCell(cur));

				if(solved)
					return true;
				else
					arr[cur.row][cur.column] = 0;
			}
			return false;
		}

		    public static void main(String[] args) throws FileNotFoundException{

			String filename = "/home/zemoso012/p096_sudoku.txt";
			Scanner scanner = new Scanner(new File(filename));
			String[] array = new String[9];
			arr = new int[9][9];
			int sum =0;
			
			while(scanner.hasNextLine())
			{	
				scanner.nextLine();
				for(int i=0 ; i<9 ; i++)
				{
					String s = scanner.nextLine();
					array = s.split("");
					for(int j =0 ; j<9;j++)
					{
						arr[i][j] = Integer.parseInt(array[j]);
					}
				}


				boolean solved = solve(new Cell(0,0));
				if(solved)
				{
					System.out.println("Solution for the sudoku has been done");
					System.out.println("");
					printSudoku(arr);
					System.out.println("");
				}
				else
					{
					System.out.println("Unsolvable sudoku puzzler");
					}
				
				sum += (100*arr[0][0]) + (10*arr[0][1]) + arr[0][2] ;
			
				
			}
			System.out.println("");
			System.out.println("The sum of the first Three digits at the top-left cornor : " + sum);
		}

		static void printSudoku(int arr[][])
		{
			for(int i=0 ; i<9 ; i++)
			{
				for(int j =0 ; j<9;j++)
				{
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
				System.out.println("");

			}
		}
	
	}
	
}

