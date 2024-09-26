import java.util.ArrayList;
import java.util.HashSet;

public class AllDuplicates {
    public static ArrayList<Integer> getDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Iterate through the list to identify duplicates
        for (Integer value : list) {
            if (seen.contains(value)) {
                // If value is already in 'seen', it is a duplicate
                if (!duplicates.contains(value)) {
                    result.add(value);
                    duplicates.add(value);
                }
            } else {
                // Add the value to 'seen'
                seen.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);

        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(2);
        myList2.add(3);
        myList2.add(1);
        myList2.add(4);
        myList2.add(2);
        myList2.add(1);
        myList2.add(3);
        myList2.add(0);

        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);

        System.out.println("Example 1: " + getDuplicates(myList1));
        System.out.println("Example 2: " + getDuplicates(myList2));
        System.out.println("Example 3: " + getDuplicates(myList3));
    }
}