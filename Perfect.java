import java.util.Scanner;
public class Perfect
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
       
    }
     if(sum==n)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect number");
        }
}
}



/*
steps:
1. Read an integer n  from the user.
2. Initialize a variable `sum` to 0.
3. Use a for loop to iterate from 1 to  n-1 :
   1. Check if n % i == 0  if  i  is a divisor of  n .
   2. If true, add  i  to `sum`.
4. After the loop, compare `sum` with  n .
5. If `sum` equals n, print "perfect number".
6. Otherwise, print "not perfect number".
*/







