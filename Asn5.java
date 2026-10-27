import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        //Adds 4 items to each ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        scores.add(35);
        scores.add(92);
        scores.add(11);
        scores.add(63);

        // Display the initial contents using for loop
        System.out.println("-- Initial Fruit List --");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n-- Initial Score List --");
        for (Integer score : scores) {
            System.out.println(score);
        }

        // Method 1: contains()
        boolean hasCherry = fruits.contains("Cherry");
        System.out.println("\nDoes the fruit list contain 'Cherry'? " + hasCherry);

        // Method 2: sort()
        fruits.sort(null);
        scores.sort(null);

        // Displays Arraylist with new data
        System.out.println("\n- Sorted Fruit List -");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n -- Sorted Score List --");
        for (Integer score : scores) {
            System.out.println(score);
        }
    }
}