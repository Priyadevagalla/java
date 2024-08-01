import java.util.*;
class MinMax{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
/*
Read the integer n for the size of the array.
Declare an integer array a of size n.
Loop to read n elements into the array a.
Initialize min and max with the first element of the array a[0]
Loop through the array to find the minimum and maximum element:
If a[i] < min, update min with a[i].
If a[i] > max, update max with a[i].
Print the minimum value min.
Print the maximum value max.
*/

