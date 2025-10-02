import java.util.*;
public class Sum
{
public static void main(String[] arg)
{
Scanner scan = new Scanner(System.in);
int n=scan.nextInt();
int sum=0;
for(int i=1; i<=n; i++)
{
sum=sum+i;
System.out.println(sum);
}
}
}

