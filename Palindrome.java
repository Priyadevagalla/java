import java.util.Scanner;
public class Palindrome
{
    public  static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int rev=0,
        temp=n;
        while(n!=0)
        {
            rev =  rev*10 +  n % 10;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

        
    }
}



/* Steps
1) Read an integer input from the user.
2) Initialize a variable `rev` to 0. it will hold the reversed number.
3) Store number in `temp` to compare.
4) While the input number `n` is not zero:
   1) Extract the last digit of `n` using `n % 10`.
   2) Update `rev` to `rev * 10 + digit`.
   3) Remove the last digit from `n` by dividing `n` by 10.
5) Compare the original number `temp` with the reversed number `rev`.
6) If they are equal, print "palindrome". 
otherwise, print "not palindrome".
*/





