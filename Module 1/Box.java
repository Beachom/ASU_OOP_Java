import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        // Declare and instantiate a Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the dimensions and characters
        int width, height;
        char interiorChar, borderChar;

        // Collect the required inputs
        System.out.print("Enter width    : ");
        width = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter height   : ");
        height = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter interior : ");
        interiorChar = scanner.nextLine().charAt(0);

        System.out.print("Enter border   : ");
        borderChar = scanner.nextLine().charAt(0);

        // Print the box
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                    System.out.print(borderChar);
                } else {
                    System.out.print(interiorChar);
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
        scanner.close();
    }
}
