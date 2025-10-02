import java.util.*;
public class Fcp076
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[][] = new int[size][size];
        arr[0][0] = scan.nextInt();
        int min = arr[0][0];
        for(int j=1; j<size; j++) {
            arr[0][j] = scan.nextInt();
            if(arr[0][j] < min) {
                min = arr[0][j];
            }
        }
        for(int i=1; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr[i][j] = scan.nextInt();
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
