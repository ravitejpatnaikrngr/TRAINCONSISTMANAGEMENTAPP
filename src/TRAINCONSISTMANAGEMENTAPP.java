import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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

        try {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 60));
            bogies.add(new Bogie("First Class", -10));
            bogies.add(new Bogie("Sleeper", 80));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}