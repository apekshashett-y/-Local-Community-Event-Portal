public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting

        System.out.println("Original double: " + myDouble);
        System.out.println("After casting to int: " + myInt);

        int anotherInt = 42;
        double anotherDouble = anotherInt; // Implicit casting

        System.out.println("Original int: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}
