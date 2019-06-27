package Factory;

public class Logistics {
    Transport createTransport() {
        Transport t = null;
        return t;
    }

    void doDelivery() {
        System.out.println(" do delivery");
    }

    static Logistics createlogistic(String mode) {
        if (mode.equals("road"))
            return new RoadLogistics();
        else if (mode.equals("sea"))
            return new SeaLogistics();
        return null;
    }
}
