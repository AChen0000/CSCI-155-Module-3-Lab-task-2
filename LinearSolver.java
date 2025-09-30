import java.util.Scanner;

public class LinearSolver {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { //  have loop 
            // Enter the values 
            System.out.print("Enter a, b, c, d, e, f (or type 0 0 0 0 0 0 to quit): ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double d = input.nextDouble();
            double e = input.nextDouble();
            double f = input.nextDouble();

            // Exit 
            if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0) {
                System.out.println("Goodbye!");
                break; // leave the loop
            }

            // Find the denominator (ad - bc)
            double denominator = a * d - b * c;

            // Check if denominator is 0
            if (denominator == 0) {
                System.out.println("The equation has no solution");
            } else {
                // Find x and y
                double x = (e * d - b * f) / denominator;
                double y = (a * f - e * c) / denominator;

                // Show the results
                System.out.println("x is " + x + " and y is " + y);
            }
        }

        // Finish
        input.close();
    }
}
