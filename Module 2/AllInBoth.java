import java.util.ArrayList;
import java.util.HashSet;

public class AllInBoth {
    public static ArrayList<Integer> inBoth(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set2 = new HashSet<>(list2);
        HashSet<Integer> seen = new HashSet<>();

        for (Integer value : list1) {
            if (set2.contains(value) && !seen.contains(value)) {
                result.add(value);
                seen.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Example 1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(0);
        list2.add(2);
        list2.add(9);
        list2.add(3);
        System.out.println("Example 1: " + inBoth(list1, list2)); // Output: [2, 3]

        // Example 2
        list1.clear();
        list2.clear();

        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(0);

        list2.add(0);
        list2.add(2);
        list2.add(9);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        System.out.println("Example 2: " + inBoth(list1, list2)); // Output: [3, 2, 5, 0]

        // Example 3
        list1.clear();
        list2.clear();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("Example 3: " + inBoth(list1, list2)); // Output: []
    }
}
