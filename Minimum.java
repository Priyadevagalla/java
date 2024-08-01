import java.util.*;
class Minimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Minimum number is: " + min);
    }
}
/*
Read the integer n for the size of the array.
Declare an integer array a of size n.
Loop to read n elements into the array a.
Initialize min with the first element of the array a[0].
Loop to find the minimum element:
If a[i] < min, update min with a[i].
Print the minimum value min.
*/
