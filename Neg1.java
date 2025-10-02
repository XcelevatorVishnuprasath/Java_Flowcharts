import java.util.*;
public class Neg1
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int arr[]=new int[size];
for(int i=0; i<size; i++)
{
arr[i]=scan.nextInt();
}
for(int i=0; i<size; i++)
{
if(arr[i]<0)
{
System.out.println(0+" ");
}
else
{
System.out.println(arr[i]+" ");
}
}
}
}