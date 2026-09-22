public class Runner {
    public static void main(String[] args) {
        // Instantiate the Tests object
        Tests myTests = new Tests();

        // Prompt for scores and calculate average
        myTests.getAverage();

        // Print the result formatted by toString()
        System.out.println(myTests.toString());
    }
}