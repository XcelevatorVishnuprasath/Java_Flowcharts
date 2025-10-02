import java.util.*;
public class Digit
{
public static void main(String[] args)
{
Scanner scan= new Scanner(System.in);
int num = scan.nextInt();
int d=scan.nextInt();
if(1<=num&& num<=1000 && 0<=d && d<=9)
for(int i=1; i<=num+1; i++)
{
if(d==i || i%10==d)
continue;
System.out.println(i);
}
}
}