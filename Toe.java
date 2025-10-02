import java.util.*;
public class Toe
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int size  = scan.nextInt();
int arr[][]=new int[size][size];
for(int i=0; i<size; i++)
{
for(int j=0; j<size; j++)
{
arr[i][j]=scan.nextInt();
}
}
boolean Try=true;
for(int i=0; i<size-1; i++)
{
for(int j=0; j<size-1; j++)
{
if(arr[i][j]!=arr[i+1][j+1])
{
Try=false;
break;
}
}
}
if(Try)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}