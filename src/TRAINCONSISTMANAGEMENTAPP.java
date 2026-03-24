import java.util.LinkedHashSet;
import java.util.Set;
public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        Set<String> trainFormation = new LinkedHashSet<>();
        System.out.println("\nAttaching bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        System.out.println("Attempting to add duplicate bogie 'Sleeper'...");
        trainFormation.add("Sleeper");
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
        System.out.println("\nTotal Bogies: " + trainFormation.size());
        System.out.println("\nTrain formation is unique and ordered.");
    }
}