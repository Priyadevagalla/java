import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        String hexadecimalNumber = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println( hexadecimalNumber);
    }
}




/*
Read Input From User
Read Decimal Number as Integer
Convert Decimal Integer to Hexadecimal String
Print Hexadecimal Equivalent
*/