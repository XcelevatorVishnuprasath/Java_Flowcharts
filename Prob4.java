import java.util.Scanner;
public class Prob4
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int age = scan.nextInt();
char Gender = scan.next().charAt(0);
int workdays = scan.nextInt();
int wage = 0;
if (age >= 18 && age < 30 && Gender == 'F')
{
 wage = workdays*750;
}
else if (age >= 18 && age < 30 && Gender == 'M')
{
 wage = workdays*700;
}
else if (age >= 30 && age <= 40 && Gender == 'F')
{
 wage = workdays*850;
}
else if (age >= 30 && age <= 40 && Gender == 'M')
{
 wage = workdays*800;
}
System.out.println(wage);
}
}