import java.util.Scanner;
class Primee
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int count = 0;
if(n<2)
{
    System.out.println("not a prime");
}
for (int i=2;i<=n;i++) 
{
if (n%i==0)
{
count++;
}
}
if(count > 1)
{
 System.out.println("The number is not prime");
}
else
{
System.out.println("The number is prime");
}
}
}
