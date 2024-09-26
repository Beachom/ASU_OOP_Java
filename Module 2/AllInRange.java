import java.util.ArrayList;

public class AllInRange {
    public static ArrayList<Integer> getInRange(ArrayList<Integer> list, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer value : list) {
            if (value >= min && value <= max) {
                result.add(value);
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
        myList2.add(7);
        myList2.add(6);
        myList2.add(2);
        myList2.add(9);
        myList2.add(0);
        myList2.add(4);
        myList2.add(8);

        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);

        System.out.println("Example 1: " + getInRange(myList1, 2, 4));
        System.out.println("Example 2: " + getInRange(myList2, 3, 10));
        System.out.println("Example 3: " + getInRange(myList3, 1, 1));
    }
}
