import java.util.Scanner;
public class Prob3
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int min1 = 0;
int min2 = 0;
if (a<b)
{
min1 = a;
min2 = b;
}
else
{
min1 = b;
min2 = a;
}
if (min2<c)
{
if (min1<c)
{
min2 = c;
}
else
{
min2=min1;
min1=c;
}
}
if(min2<d)
{
if(min1<d)
{
min2=d;
}
else
{
min2=min1;
min1=d;
}
}
System.out.println(min2);
}
}