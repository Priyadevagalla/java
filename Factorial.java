import java.util.Scanner;
class Factorial
{
    static int factorial(int n) {
    int r=1;
    for (int i = 1; i < n; i++) {
    r *= i;
    }
    return r;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}


/*
Starts:
1.Input Reading:
2)Initialize r = 1.
3)Execute a loop from i = 1 to i <= num:
Loop Iteration:
Multiply r by i and update r (i.e., r = r * i).
Continue the loop until i reaches num.
4) print result
*/

