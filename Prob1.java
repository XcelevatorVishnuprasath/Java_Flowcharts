import java.util.Scanner;
public class Prob1
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int total=0;
if (a<b)
{
a=a*1;
b=b-a;
b=b*2;
total=a+b;
System.out.println(total);
}
else
{
System.out.println(b);
}
}
}


