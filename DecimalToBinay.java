import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println( binaryNumber);
    }
}

/*
Start
Read Input from user
Read Decimal Number as Integer
Convert Decimal Integer to Binary String
Print Binary Equivalent
End
*/