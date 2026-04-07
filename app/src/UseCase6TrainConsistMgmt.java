import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        // Display all bogie capacity details
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example of fast lookup
        System.out.println("\nCapacity of Sleeper bogie: "
                + bogieCapacity.get("Sleeper"));

        System.out.println("\nSystem ready for further operations.");
    }
}