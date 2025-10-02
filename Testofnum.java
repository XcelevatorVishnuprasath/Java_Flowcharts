import java.util.Scanner;
public class Testofnum {
public static void main(String[] args) {
int A = 9;
int B = 10;
int C = 11;
int D = 2;
int smallest = A;
if (B < smallest) smallest = B;
if (C < smallest) smallest = C;
if (D < smallest) smallest = D;
int secondSmallest = Integer.MAX_VALUE;
if (A != smallest && A < secondSmallest) secondSmallest = A;
if (B != smallest && B < secondSmallest) secondSmallest = B;
if (C != smallest && C < secondSmallest) secondSmallest = C;
if (D != smallest && D < secondSmallest) secondSmallest = D;
System.out.println(secondSmallest);
}
}
