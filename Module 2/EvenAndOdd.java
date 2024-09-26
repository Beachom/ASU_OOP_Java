public class EvenAndOdd {
    public static int[] evenAndOdd(int[] array) {
        if (array == null || array.length == 0) {
            return new int[] { 0, 0 }; // Handle empty array case
        }

        int oddCount = 0;
        int evenCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[] { oddCount, evenCount };
    }

    public static void main(String[] args) {
        int[] myArray1 = { 1, 2, 3, 4, 5 };
        int[] myArray2 = { 3, 7, 6, 2, 9, 0, 4, 8 };
        int[] myArray3 = { 1, 1, 1 };

        int[] result1 = evenAndOdd(myArray1);
        int[] result2 = evenAndOdd(myArray2);
        int[] result3 = evenAndOdd(myArray3);

        System.out.printf("Example 1: Odds = %d, Evens = %d%n", result1[0], result1[1]);
        System.out.printf("Example 2: Odds = %d, Evens = %d%n", result2[0], result2[1]);
        System.out.printf("Example 3: Odds = %d, Evens = %d%n", result3[0], result3[1]);
    }
}