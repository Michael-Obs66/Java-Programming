import java.util.ArrayList;
import java.util.List;

public class ArraysAndCollections {
    public static void main(String[] args) {
        // Array example
        int[] numbers = {1,2,3,4,5};
        for(int n : numbers) {
            System.out.println("Number: " + n);
        }

        // ArrayList example
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        System.out.println("Users: " + users);
    }
}
