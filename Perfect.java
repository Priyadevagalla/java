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