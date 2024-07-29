import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int temp=n;
    int r,sum=0;
    while(n>0)
    {
        r=n%10;;
        n=n/10;
        sum = sum + r * r * r;
    }
    if(sum==temp)
    {
        System.out.println(" is armmstrong ");
    }
    else
    {
        System.out.println("not an armstrong");
    }
    }
}







/*
steps:
1)Read an integer n from the user.
2.Store Original Number using temp
3.Initialize a variable sum to 0. 
4.Loop until the number n becomes 0:
1)Extract the Last Digit
2)Remove the Last Digit
3)Compute the Cube and Add to Sum
5)Compare temp and num
6)print result
*/
