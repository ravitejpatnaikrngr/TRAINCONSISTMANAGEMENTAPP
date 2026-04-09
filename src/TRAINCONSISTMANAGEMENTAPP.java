import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 65));

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}