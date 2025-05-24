import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");

        System.out.print("Enter student ID to lookup: ");
        int id = scanner.nextInt();

        String name = studentMap.get(id);
        if (name != null) {
            System.out.println("Student name: " + name);
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
