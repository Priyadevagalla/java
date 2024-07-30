import java.util.*;
class Primerange
{  public static void prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println(n+" ");
        }
    }
    
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int st=sc.nextInt();
     int nd=sc.nextInt();
     for(int i=st;i<=nd;i++)
     {
         prime(i);
     }
    }
}