import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message (UC1)
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies (Create operation)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // REMOVE a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}