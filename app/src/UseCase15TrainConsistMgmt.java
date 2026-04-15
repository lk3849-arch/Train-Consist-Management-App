import java.util.*;

public class UseCase15TrainConsistMgmt {

    // -------- CUSTOM RUNTIME EXCEPTION --------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // -------- GOODS BOGIE --------
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            try {
                // RULE: Rectangular cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // If safe
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Exception Caught: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=======================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // SAFE assignment
        b1.assignCargo("Petroleum");

        // UNSAFE assignment
        b2.assignCargo("Petroleum");

        // Continue program
        b2.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}