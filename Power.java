import java.util.Scanner;

public class Power
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(); 
        int exponent = sc.nextInt();    
        int result = 1; 
        for (int i = 0; i < exponent; i++) {
            result *= base; 
        }
        System.out.println("Result = " + result);

       
    }
}



/*
steps:
1)Inputs Reading :base,exponent
2)intialize result=1
3)Execute a loop from i =0 to exponent:
Loop Iteration:
Multiply the result by base.
Update result with this new value.
4) print result
*/
