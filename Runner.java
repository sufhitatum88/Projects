import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // 1. First Pet object using the default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        // 2. Second Pet object using the 3-parameter constructor
        Pet pet2 = new Pet("Dog", "Fluffy", 9);
        System.out.println(pet2.toString());

        // 3. Third Pet object using Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter animal type: ");
        String userType = scanner.nextLine();

        System.out.print("Enter animal name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter animal age: ");
        int userAge = scanner.nextInt();

        Pet pet3 = new Pet(userType, userName, userAge);
        System.out.println(pet3.toString());

        scanner.close();
    }
}