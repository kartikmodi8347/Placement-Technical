// Method Overloading and Constructor Overloading program 
// in short


public class OverloadingExample {
    // Method Overloading
    public static void printMessage() {
        System.out.println("Hello!");
    }

    public static void printMessage(String message) {
        System.out.println("Hello, " + message);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    // Constructor Overloading
    public OverloadingExample() {
        System.out.println("Default constructor");
    }

    public OverloadingExample(String message) {
        System.out.println("Constructor with message: " + message);
    }

    public OverloadingExample(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Constructor: " + message);
        }
    }

    public static void main(String[] args) {
        // Method Overloading
        printMessage();                         // Hello!
        printMessage("John");                   // Hello, John
        printMessage("Hello", 3);               // Hello, Hello, Hello

        // Constructor Overloading
        OverloadingExample example1 = new OverloadingExample();                        // Default constructor
        OverloadingExample example2 = new OverloadingExample("Hello, constructor!");   // Constructor with message: Hello, constructor!
        OverloadingExample example3 = new OverloadingExample("Hi", 2);                 // Constructor: Hi, Constructor: Hi
    }
}
