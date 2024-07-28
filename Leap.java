import java.util.Scanner;
class Leap
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    if(n % 400==0  )
    {
        System.out.println(n +"is leap year");
    }
    if(n%4==0 && n%100!=0)
    {
         System.out.println(n +"is leap year");
    }
    else
    {
        System.out.println("not a leap year");
    }
    }
}