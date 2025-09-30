import java.util.Scanner;

public class LinearSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the values 
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Find denominator (ad - bc)
        double denominator = a * d - b * c;

        // Check if denominator is 0
        if (denominator == 0) {
            // If the denominator is 0, the equations cannot be solved
            System.out.println("The equation has no solution");
        } else {
            // If the denominator is not 0, find x and y
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            // Show the results
            System.out.println("x is " + x + " and y is " + y);
        }

        // Finish
        input.close();
    }
}
