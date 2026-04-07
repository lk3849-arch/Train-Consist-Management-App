import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate

        // Display formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // Display total bogies
        System.out.println("\nTotal unique bogies: " + trainFormation.size());

        System.out.println("\nSystem prevents duplicate bogies and maintains order.");
    }
}