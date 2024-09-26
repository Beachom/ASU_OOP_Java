public class AverageSum {
    public static double[] averageAndSum(int[] array) {
        if (array == null || array.length == 0) {
            return new double[] { 0.0, 0.0 }; // Handle empty array case
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = sum / array.length;

        return new double[] { average, sum };
    }

    public static void main(String[] args) {
        int[] myArray1 = { 1, 2, 3, 4, 5 };
        int[] myArray2 = { 3, 7, 6, 2, 9, 0, 4, 8 };
        int[] myArray3 = { 1, 1, 1 };

        double[] result1 = averageAndSum(myArray1);
        double[] result2 = averageAndSum(myArray2);
        double[] result3 = averageAndSum(myArray3);

        System.out.printf("Example 1: Average = %.1f, Sum = %.1f%n", result1[0], result1[1]);
        System.out.printf("Example 2: Average = %.3f, Sum = %.1f%n", result2[0], result2[1]);
        System.out.printf("Example 3: Average = %.1f, Sum = %.1f%n", result3[0], result3[1]);
    }
}
