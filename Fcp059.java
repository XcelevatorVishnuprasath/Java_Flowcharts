import java.util.*;
public class Fcp059
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
		for(int i=0; i<size; i++)
		{
			boolean get = false;
			
			for(int k=0; k<i; k++)
			{
				if(arr[i]==arr[k])
				{
					get = true;
					break;
				}
			}
			if(get==true)
			{
				continue;
			}
			for(int j=i+1; j<size; j++)
				{
					if(arr[i]==arr[j])
					{
					System.out.println(arr[i]);
					break;
					}
				}
		}
	}
}
