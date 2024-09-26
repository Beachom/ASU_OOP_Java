import java.util.ArrayList;

public class LessThanAverage {
    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        if (list == null || list.isEmpty()) {
            return result;
        }

        // Calculate the average
        double sum = 0;
        for (Integer value : list) {
            sum += value;
        }
        double average = sum / list.size();

        // Find elements less than the average
        for (Integer value : list) {
            if (value < average) {
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

        System.out.println("Example 1: " + lessThanAverage(myList1));
        System.out.println("Example 2: " + lessThanAverage(myList2));
        System.out.println("Example 3: " + lessThanAverage(myList3));
    }
}