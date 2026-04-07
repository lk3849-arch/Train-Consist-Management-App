import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        // Program continues
        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}