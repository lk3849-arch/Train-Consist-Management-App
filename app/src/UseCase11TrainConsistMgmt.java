import java.util.Scanner;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Code ");
        System.out.println("=======================================\n");

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // REGEX PATTERNS
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // VALIDATION USING PATTERN
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // OUTPUT
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        System.out.println("\nUC11 validation completed...");
    }
}