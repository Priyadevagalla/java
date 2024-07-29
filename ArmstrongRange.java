import java.util.Scanner;

class ArmstrongRange {
    public static void check(int n) {
        int temp = n; 
        int count = 0;
        int sum = 0;
        while (n > 0) {
            n = n / 10;
            count++; 
        }
        n = temp;
        while (n > 0) {
            int digit = n % 10; 
            sum += Math.pow(digit, count); 
            n = n / 10; 
        }
        if (temp == sum) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(); 
        int end = sc.nextInt(); 
           System.out.println( start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            check(i); 
        }
    }
}


/*steps:
1)Read the starting value of the range start.
2)Read the ending value of the range end.
Iterate Through the Range:
1.Loop from start to end.
2.Check Each Number:
3)Count the Number of Digits:
4)Initialize count to zero.
Use a while loop 
5)Calculate the Armstrong Sum:
Reset the number to its original value.
Initialize sum to zero.
Use another while loop to extract each digit of the number and find sum
6)Compare:
Check if the original number (temp) is equal to sum.
If they are equal, print the number.
*/
