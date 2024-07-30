import java.util.Scanner;

public class Automarphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int square = n * n; 
        int temp = n,div=1;
        while (temp > 0) {
            div*= 10;
            temp /= 10;
        }
        if (square % div == n) {
            System.out.println(n + " is an automorphic number.");
        } else {
            System.out.println(n + " is not an automorphic number.");
        }
    }
}