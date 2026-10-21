import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields
    private int length;
    private int[] myArray;

    //  Constructor
    public IntArray(int length) {
        this.length = length;
        this.myArray = new int[length];
    }

    //  Returns the size/length of the array
    public int size() {
        return this.length;
    }

    // Fills the array with random numbers (between 1 and 6)
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // 5. Sets a specific index to a new value
    public void set(int index, int newValue) {
        if (index >= 0 && index < myArray.length) {
            myArray[index] = newValue;
        }
    }


    public int get(int index) {
        if (index >= 0 && index < myArray.length) {
            return myArray[index];
        }
        return -1; // Fallback for out-of-bounds
    }

    // 7. Checks if the array is empty
    public boolean isEmpty() {
        return length == 0 || myArray == null;
    }

    // 8. Resets values
    public void clear() {
        this.length = 0;
        this.myArray = new int[0];
    }

    // 9. Sorts the array
    public void sort() {
        if (myArray != null) {
            Arrays.sort(myArray);
        }
    }

    // 10. Returns a string representation
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}