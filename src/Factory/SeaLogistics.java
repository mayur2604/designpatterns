package Factory;

public class SeaLogistics extends Logistics
{
    Transport createTransport(){
        Transport t=new Ship();
        return t;
    }
}
