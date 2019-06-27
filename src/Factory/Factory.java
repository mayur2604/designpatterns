package Factory;
import java.util.*;
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
