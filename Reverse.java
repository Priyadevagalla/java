import java.util.Scanner;
public class Reverse
{
    public  static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int rev=0;
        while(n!=0)
        {
            rev =  rev*10 +  n % 10;
            n=n/10;
        }
        System.out.println(rev);
    }
}





/* Steps
1) Read an integer input.
2) Initialize a variable `rev` to 0. it will hold the reversed number.
3) While the input number `n` is not zero then
   1)Extract the last digit of `n` using `n % 10`.
   2)Update rev to rev * 10 + digit.
   3)Remove the last digit from `n` by dividing `n` by 10.
4) Print the reversed number.
*/
