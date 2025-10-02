import java.util.Scanner;
public class Prob2{
public static void main(String[] args){
Scanner Scan = new Scanner(System.in);
int a = Scan.nextInt();
int b = Scan.nextInt();
int c = Scan.nextInt();
if (a+b>c && b+c>a && c+a>b){
 if (a==b && b==c){
System.out.println("Equilateral");}
else if (a==b||b==c||c==a) {
System.out.println("Isosceles");}
else{
System.out.println("Scalene");}}
else{
System.out.println("invalid");}
}
}