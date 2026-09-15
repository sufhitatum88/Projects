public class Pet {

    private String type;
    private String name;
    private int age;

    // Default Constructor (uses mutator method)
    public Pet() {
        setType("Animal");
        setName("Pet Name");
        setAge(1);
    }

    public Pet(String type, String name, int age) {
        setType(type);
        setName(name);
        setAge(age);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }




    // toString method to return object to string
    @Override
    public String toString() {
        String output = "";
        output += "Pet information:\n";
        output += "Type: " + type + "\t";
        output += "Name: " + name + "\t";
        output += "Sound: " + speak() + "\t";
        output += "Age:  " + age + "\n";
        return output;
    }
}