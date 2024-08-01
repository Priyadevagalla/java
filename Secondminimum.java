import java.util.*;
class Secondminimum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int secmin=a[1];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            else if(a[i]<secmin)
            {
                secmin=a[i];
            }
    }
    System.out.println("Minimum number is: " + secmin);
}
}


