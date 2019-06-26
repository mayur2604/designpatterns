interface Transport
{
    void deliver();
}
class Truck implements Transport
{
   public  void deliver(){
        System.out.println("deliver cargo by land");
    }
}
class Ship implements Transport
{
    public void deliver(){
        System.out.println("deliver cargo by sea");
    }
}


class Logistics
{
     Transport createTransport(){
        Transport t=null;
        return t;
    }
    void doDelivery(){
         System.out.println(" do delivery");
    }
}
class RoadLogistics extends Logistics
{
    Transport createTransport(){
        Transport t=new Truck();
        return t;
    }
}

class SeaLogistics extends Logistics
{
    Transport createTransport(){
        Transport t=new Ship();
        return t;
    }
}


public class Factory {

    public static void main(String[] args) {
        Logistics sea=new SeaLogistics();
        Transport t=sea.createTransport();
        t.deliver();
        Logistics road=new RoadLogistics();
        t=road.createTransport();
        t.deliver();
        road.doDelivery();
    }
}
