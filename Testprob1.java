import java.util.Scanner;
public class Testprob1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(x);
int a = scanner.nextInt();
System.out.print(y);
int b = scanner.nextInt();
int earnings = 0;
if (b <= a) {
earnings = b * 1;
} else {
earnings = a * 1 + (b - a) * 2;
}
System.out.println("Total earnings: " + earnings);
scanner.close();
}
}