import java.util.Scanner; // Import the Scanner class

class TempConversion { // The class name should match the file name

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        double fahrenheit = scanner.nextDouble();

        double kelvin = fahrenheitToKelvin(fahrenheit);

        System.out.printf("%.2f degrees from Fahrenheit to Kelvin is %.2f\n", fahrenheit, kelvin);

        scanner.close();
    }
}