import java.util.Scanner;
public class Harshednumber
{
    public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int temp=n;
    int sum=0;
    while(n!=0)
    {
        int r=temp%10;
        sum=sum+r;
        n=n/10;
        
    }
    if(n%sum==0)
    {
        System.out.println("harshed number");
    }
    else
    {
        System.out.println("not harshed number");
    }
}
}





/*
Read integer n using Sc.nextInt().
Initialize temp to n.
Initialize sum to 0.
While n is not 0:
Find the last digit of n using temp % 10.
Add the last digit to sum.
Remove the last digit from n by performing n = n / 10.
Check if temp % sum == 0:
If true, print "harshed number".
Otherwise, print "not harshed number".
    */
