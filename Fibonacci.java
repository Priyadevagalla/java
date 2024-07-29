import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int a=0,b=1;
    int c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
    {
        c=a+b;
        a=b;
        b=c;
    }
}
}
}
    


/*
steps:
1)Read an integer n
2)Initialize Variables:
3)Generate Fibonacci Numbers:
1.Loop from i = 1 to n 
2.Print the Current Fibonacci Number
4)Calculate the Next Fibonacci Number:
Compute c as the sum of a and b.
Update Fibonacci Numbers
Set a to the value of b
Set b to the value of c
5)print result
*/