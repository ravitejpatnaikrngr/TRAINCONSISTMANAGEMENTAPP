import java.util.HashSet;
import java.util.Set;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        Set<String> bogieIds = new HashSet<>();
        System.out.println("\nAdding bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
        System.out.println("\nTrain system ensures no duplicate bogie IDs.");
    }
}