import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = 1; 
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;  
            }
        }

        System.out.println("The GCD of " + a + " and " + b + " is: " + GCD);
    }
}
