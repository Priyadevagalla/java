import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPerfectSquare = false;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare==true) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}
