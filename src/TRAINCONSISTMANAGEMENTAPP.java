import java.util.*;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }
            this.cargo = cargo;
            System.out.println(type + " bogie assigned cargo: " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed");
        }
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Cargo: " + cargo;
    }
}

public class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical"));
        bogies.add(new GoodsBogie("Rectangular"));
        bogies.add(new GoodsBogie("Open"));

        bogies.get(0).assignCargo("Petroleum");
        bogies.get(1).assignCargo("Petroleum");
        bogies.get(2).assignCargo("Coal");

        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }
    }
}