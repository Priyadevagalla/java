import java.util.Scanner;
class Evenodd{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n +"is even");
        }
        else
        {
            System.out.println(n +"is odd");
        }
      
    }
}