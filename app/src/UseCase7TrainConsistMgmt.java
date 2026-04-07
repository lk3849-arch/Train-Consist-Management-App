import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (ascending order of capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further operations.");
    }
}