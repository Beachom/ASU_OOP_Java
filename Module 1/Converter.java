import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        // Declare and instantiate a Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the user's input and the Feet and Inches
        // equivalent value
        double meters;
        String feetAndInches;

        // Collect the required input
        System.out.print("Enter distance in Meters : ");
        meters = scanner.nextDouble();

        // Call the metersToFeetAndInches method
        feetAndInches = metersToFeetAndInches(meters);

        // Display the required results
        System.out.printf("%.2f meters is : %s\n", meters, feetAndInches);
        scanner.close();
    }

    // Define the metersToFeetAndInches method here below
    public static String metersToFeetAndInches(double meters) {
        // 1 meter = 39.37 inches
        double totalInches = meters * 39.37;
        int feet = (int) (totalInches / 12); // 1 foot = 12 inches
        double inches = totalInches % 12;

        // Return the formatted result
        return String.format("%d' %.2f\"", feet, inches);
    }
}
