import java.util.*;
public class Fcp057
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int arr[] = new int[size];
int m=scan.nextInt();
for(int i=0; i<size; i++)
{
	arr[i]=scan.nextInt();
}
for(int i=m-1; i<size-1; i++)
{
	arr[i]=arr[i+1];
}
for(int i=0; i<size-1; i++)
{
	System.out.println(arr[i]);
}
}
}
