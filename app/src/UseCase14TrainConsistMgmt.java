import java.util.*;

public class UseCase14TrainConsistMgmt {

    // -------- CUSTOM EXCEPTION --------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // -------- PASSENGER BOGIE --------
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            // VALIDATION (FAIL-FAST)
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC14 - Custom Exception Handling ");
        System.out.println("=======================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // VALID CASES
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));

            // INVALID CASE (will throw exception)
            bogies.add(new PassengerBogie("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC14 execution completed...");
    }
}