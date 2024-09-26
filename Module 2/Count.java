public class Count {
    public static int countGreaterThanAvg(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Handle empty or null array case
        }

        // Compute the sum and average
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;

        // Count values greater than the average
        int count = 0;
        for (int num : array) {
            if (num > average) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] myArray1 = { 1, 2, 3, 4, 5 };
        int[] myArray2 = { 13, 7, 6, 5, 99, 10, 4, 8 };
        int[] myArray3 = { 1, 1, 1 };

        System.out.printf("Example 1: Count Greater Than Avg = %d%n", countGreaterThanAvg(myArray1));
        System.out.printf("Example 2: Count Greater Than Avg = %d%n", countGreaterThanAvg(myArray2));
        System.out.printf("Example 3: Count Greater Than Avg = %d%n", countGreaterThanAvg(myArray3));
    }
}