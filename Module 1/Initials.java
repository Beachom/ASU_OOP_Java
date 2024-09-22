import java.util.Scanner;

public class Initials {

    // Method to compute the initials from a full name
    public static String toInitials(String name) {
        String[] parts = name.trim().split("\\s+"); // Split the name by whitespace
        StringBuilder initials = new StringBuilder();

        for (String part : parts) {
            if (!part.isEmpty()) {
                initials.append(Character.toUpperCase(part.charAt(0))).append(". ");
            }
        }

        // Remove the trailing space before returning
        return initials.toString().trim();
    }

    public static void main(String[] args) {
        // Declare and instantiate a Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the user's input and initials
        String fullName;
        String initials;

        // Collect the required input
        System.out.print("Enter name : ");
        fullName = scanner.nextLine();

        // Call the toInitials method
        initials = toInitials(fullName);

        // Display the results
        System.out.printf("For %s initials are : %s\n", fullName, initials);
        scanner.close();
    }
}