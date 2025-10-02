import java.util.*;
public class Pass
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int theory = scan.nextInt();
int practical = scan.nextInt();
int grace = scan.nextInt();
if(0<=theory && theory<=100 && 0<=practical && practical<=50 && 0<=grace && grace<=1)
{
if(theory>=35 && practical>=20)
{
System.out.println("Pass");
}
else if(theory>=33 && practical>=18 && grace==1)
{
System.out.println("Pass with Grace");
}
else
{
System.out.println("Fail");
}
}
}
}


