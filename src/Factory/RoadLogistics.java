package Factory;

public class RoadLogistics extends Logistics {
    Transport createTransport() {
        Transport truck = new Truck();
        return truck;
    }
}