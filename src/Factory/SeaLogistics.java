package Factory;

public class SeaLogistics extends Logistics {
    Transport createTransport() {
        Transport ship = new Ship();
        return ship;
    }
}
