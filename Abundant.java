import java.util.Scanner;
public class Abundant
{
    public static void main(String args[])
{
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int temp=n;
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
        if(sum>temp)
        {
            System.out.println("abundant");
        }
    
}
}