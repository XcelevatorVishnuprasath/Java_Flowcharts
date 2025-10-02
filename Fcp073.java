import java.util.*;
public class Fcp073
{
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		int size = scan.nextInt();
		int mata [][] = new int [size][size];
		int matb [][] = new int [size][size];
		int sum [][] = new int [size][size];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				mata [i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				matb [i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				sum [i][j] = mata[i][j] + matb[i][j];
			}
		}
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(sum [i][j]+" ");
				System.out.println();
			}
		}
	}
}