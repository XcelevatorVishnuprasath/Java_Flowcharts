import java.util.*;
public class Fcp056
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				sum1=sum1+arr[i];
			}
			else if(arr[i]%2!=0)
			{
				sum2=sum2+arr[i];
			}
		}
		System.out.println(sum2);
		System.out.println(sum1);
	}
}
