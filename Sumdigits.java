import java.util.Scanner;
public class Sumdigits
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int sum=0;
      while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
        
    }
}


/*Steps
1)input the number
2)initialize sum
3)Loop Until n is 0
4)While n is not equal to 0, repeat the following steps:
extract last digit
add lastdigit to sum
remove last digit
5)print sum
*/