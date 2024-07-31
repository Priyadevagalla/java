import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octalNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(octalNumber, 8);
        System.out.println("The decimal equivalent of octal number " + octalNumber + " is: " + decimalNumber);
    }
}



/*
Read input from user
Read Octal Number as String
Convert Octal String to Decimal Integer
Print Decimal Equivalent
*/