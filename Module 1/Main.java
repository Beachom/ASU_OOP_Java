public class Main {

    // Method to compute the positive difference between the min and max of three
    // integers
    public static int minMaxDiff(int a, int b, int c) {
        // Initialize min and max with the value of the first argument
        int min = a;
        int max = a;

        // Compare with the second argument
        if (b < min) {
            min = b;
        }
        if (b > max) {
            max = b;
        }

        // Compare with the third argument
        if (c < min) {
            min = c;
        }
        if (c > max) {
            max = c;
        }

        // Return the positive difference between max and min
        return max - min;
    }

    public static void main(String[] args) {
        // Test the minMaxDiff method with different values
        System.out.println("minMaxDiff(1, 2, 3) = " + minMaxDiff(1, 2, 3)); // should return 2
        System.out.println("minMaxDiff(50, 10, 20) = " + minMaxDiff(50, 10, 20)); // should return 40
        System.out.println("minMaxDiff(1, 1, 1) = " + minMaxDiff(1, 1, 1)); // should return 0
        System.out.println("minMaxDiff(50, 100, 10) = " + minMaxDiff(50, 100, 10)); // should return 90
    }
}
