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