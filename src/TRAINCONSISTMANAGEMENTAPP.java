import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 50 + (i % 50)));
        }

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();

        long loopTime = endLoop - startLoop;
        long streamTime = endStream - startStream;

        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}