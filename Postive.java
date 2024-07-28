import java.util.Scanner;
class Postive
{
    public static void main(String[] args)
    {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    if(n>0)
    {
        System.out.println("postive number");
    }
    else if(n<0)
    {
        System.out.println("negative number");
    }
    else
    {
        System.out.println("Zero");
    }
}
}