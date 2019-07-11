package Factory;

public class Logistics {
    Transport createTransport() {
        Transport transport = null;
        return transport;
    }

    void doDelivery() {
        System.out.println(" do delivery");
    }

    static Logistics createlogistic(String mode) {
        if (mode.equals("road"))
            return new RoadLogistics();
        else if (mode.equals("sea"))
            return new SeaLogistics();
        else
            return null;
    }
}
