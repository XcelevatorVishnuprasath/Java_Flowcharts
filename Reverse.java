import java.util.*;
public class Reverse
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int row = scan.nextInt();
int col = scan.nextInt();
int arr[][]=new int[row][col];
for(int i=0; i<row; i++)
{
for(int j=0; j<col; j++)
{
arr[i][j]=scan.nextInt();
}
}
for(int i=0; i<row; i++)
{
for(int j=0; j<col; j++)
{
int temp=arr[i][j];
arr[i][j]=arr[i][j];
arr[i][j]=temp;
}
}
for(int i=0; i<row; i++)
{
for(int j=0; j<row; i++)
{
System.out.println(arr[i][j]);
}
}
}
}