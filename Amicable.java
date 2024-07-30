import java.util.Scanner;
public class Amicable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumN = 0;
        int sumM = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumN += i;
            }
        }
        for (int j = 1; j < m; j++) {
            if (m % j == 0) {
                sumM += j;
            }
        }
        if (sumN == m && sumM == n) {
            System.out.println("Amicable");
        } else {
            System.out.println("Not Amicable");
        }

    }
}
