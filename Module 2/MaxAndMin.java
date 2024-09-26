public class MaxAndMin {
    public static int[] maxAndMin(int[] array) {
        if (array == null || array.length == 0) {
            return new int[] { 0, 0 }; // Handle empty array case
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return new int[] { max, min };
    }

    public static void main(String[] args) {
        int[] myArray1 = { 1, 2, 3, 4, 5 };
        int[] myArray2 = { 3, 7, 6, 2, 9, 0, 4, 8 };
        int[] myArray3 = { 1, 1, 1 };

        int[] result1 = maxAndMin(myArray1);
        int[] result2 = maxAndMin(myArray2);
        int[] result3 = maxAndMin(myArray3);

        System.out.printf("Example 1: Max = %d, Min = %d%n", result1[0], result1[1]);
        System.out.printf("Example 2: Max = %d, Min = %d%n", result2[0], result2[1]);
        System.out.printf("Example 3: Max = %d, Min = %d%n", result3[0], result3[1]);
    }
}