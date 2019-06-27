package Factory;

public class RoadLogistics extends Logistics
{
    Transport createTransport(){
        Transport t=new Truck();
        return t;
    }
}