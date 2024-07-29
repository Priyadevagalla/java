import java.util.Scanner;
public class Factors
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}


/*
steps;
1)Read an integer number from the user.
2)loop iteration
Repeat while i is less than or equal to number::
If number % i == 0, then i is a factor.
Print i as a factor.
Increment i by 1
3)print result
*/