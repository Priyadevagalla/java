import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1; 
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;  
            }
        }

        System.out.println("The HCF of " + a + " and " + b + " is: " + hcf);
    }
}



steps:
/*
1.Read two integers 𝑎 and 𝑏 from the user
2. Initialize a variable GCD to 1.
3)Use a for loop to iterate from 1 to the smaller of the two numbers,  a or b
Check if 𝑎%i==0 and b%i==0(if is a common divisor of a and b)
If true, set GCD to i;
4)After the loop, print the value of GCD along with the original numbers a and  b
*/
