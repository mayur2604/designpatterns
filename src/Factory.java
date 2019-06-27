import java.util.*;
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
    static Logistics createlogistic(String mode){
         if(mode.equals("road"))
             return new RoadLogistics();
         else if(mode.equals("sea"))
             return new SeaLogistics();
         return null;
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

        Scanner sc=new Scanner(System.in);
        String mode=sc.next();
        Logistics logistics=Logistics.createlogistic(mode);
        Transport transport=logistics.createTransport();
        transport.deliver();
        logistics.doDelivery();
    }
}
