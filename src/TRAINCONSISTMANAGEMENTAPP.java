import java.util.HashMap;
import java.util.Map;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        Map<String, Integer> bogieCapacityMap = new HashMap<>();
        System.out.println("\nMapping bogies to their capacities...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
        System.out.println("\nChecking capacity of Sleeper bogie...");
        int sleeperCapacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + sleeperCapacity);
        System.out.println("\nTrain system ready for capacity-based operations.");
    }
}