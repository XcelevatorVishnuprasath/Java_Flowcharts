import java.util.*;
public class Fcp075
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int arr[][] = new int[size][size];
for(int i=0; i<size; i++)
{
	 for(int j=0; j<size; j++)
	 {
		 arr[i][j]= scan.nextInt();
	 }
}
for(int i=0; i<size; i++)
{
	 for(int j=0; j<size; j++)
	 {
		 System.out.print(arr[j][i]);
	 }
	 System.out.println();
}
}
}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 