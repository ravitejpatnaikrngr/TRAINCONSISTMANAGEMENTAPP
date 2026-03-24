import java.util.LinkedList;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        LinkedList<String> trainConsist = new LinkedList<>();
        System.out.println("\nAdding bogies...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Initial Train Consist: " + trainConsist);
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry");
        System.out.println("After Insertion: " + trainConsist);
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("Final Train Consist: " + trainConsist);
        System.out.println("\nTrain consist order maintained successfully.");
    }
}