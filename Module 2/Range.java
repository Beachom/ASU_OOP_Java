public class Range {
    public static int range(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Handle empty array case
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

        return max - min;
    }

    public static void main(String[] args) {
        int[] myArray1 = { 1, 2, 3, 4, 5 };
        int[] myArray2 = { 3, 7, 6, 2, 9, 0, 4, 8 };
        int[] myArray3 = { 1, 1, 1 };

        System.out.printf("Example 1: Range = %d%n", range(myArray1));
        System.out.printf("Example 2: Range = %d%n", range(myArray2));
        System.out.printf("Example 3: Range = %d%n", range(myArray3));
    }
}
