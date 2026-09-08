public class Pet {

    private String name;

    // Default Constructor (uses mutator method)
    public Pet() {
        setName("Pet Name");
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    // toString method to return object to string
    @Override
    public String toString() {
        String output = "";
        output += "Pet information:\n";
        output += "Name: " + name + "\n";
        return output;
    }


    public static void main(String[] args) {
        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        // Second Pet object using setName
        Pet pet2 = new Pet();
        pet2.setName("Fluffy");
        System.out.println(pet2.toString());
    }
}