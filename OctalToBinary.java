import java.util.Scanner;
public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octalNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println(binaryNumber);
    }
}




/*
Read Octal Number as String
Convert Octal String to Decimal Integer
Convert Decimal Integer to Binary String
Print Binary Equivalent
*/