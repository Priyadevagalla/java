import java.util.Scanner;
public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println(octalNumber);
    }
}


/*
Read Binary Number as String
Convert Binary String to Decimal Integer
Convert Decimal Integer to Octal String
Print Octal Equivalent
*/