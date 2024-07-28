//within range
import java.util.Scanner;
class Sum{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int m=Sc.nextInt();
        int sum=0;
        for(int i=n;i<=m;i++)
        {
            sum =sum+i;
            
        }
        System.out.println(sum);
    }
}