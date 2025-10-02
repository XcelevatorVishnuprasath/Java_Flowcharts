import java.util.*;
public class Fcp055
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int size = scan.nextInt();
int arr[] = new int[size];
for(int i=0; i<size; i++)
{
	arr[i] = scan.nextInt();
}
int target = scan.nextInt();
int got=0;
for(int k=0; k<size; k++)
{
	if(target == arr[k])
	{
		got=got+1;
		break;
	}
}
if(got==1)
{
	System.out.println("Yes");
}
else
{
	System.out.println("No");
}
}
}