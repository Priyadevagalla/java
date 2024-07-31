import java.util.Scanner;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(" First Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("Third Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth Quadrant.");
        } else if (x == 0 && y == 0) {
            System.out.println("is at the Origin.");
        } else if (x == 0) {
            System.out.println("lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println(" lies on the X-axis.");
        }
    }
}





/*
Read Input From User
Read x-coordinate as Integer
Read y-coordinate as Integer
Check Conditions and Determine Quadrant:
If x > 0 and y > 0, print "First Quadrant"
If x < 0 and y > 0, print "Second Quadrant"
If x < 0 and y < 0, print "Third Quadrant"
If x > 0 and y < 0, print "Fourth Quadrant"
If x == 0 and y == 0, print "is at the Origin"
If x == 0 and y != 0, print "lies on the Y-axis"
If y == 0 and x != 0, print "lies on the X-axis"
End
*/
