import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String binaryNumber = sc.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println(decimalNumber);
    }
}


/*
Start
Read input from user
Read Binary Number as String
Convert Binary String to Decimal Integer
Print Decimal Equivalent
End
*/