import java.util.*;

public class UseCase12TrainConsistMgmt {

    // Goods Bogie Model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("=======================================\n");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Display bogies
        System.out.println("Goods Bogies:");
        for (GoodsBogie b : goodsBogies) {
            System.out.println(b);
        }

        // SAFETY VALIDATION USING allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true; // other types allowed
                });

        // Output result
        System.out.println("\nSafety Status:");
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is UNSAFE for operation");
        }

        System.out.println("\nUC12 safety check completed...");
    }
}