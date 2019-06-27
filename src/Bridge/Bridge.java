package BridgeDesignPattern;
import java.util.*;
public class Bridge {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String typeOfDevice=sc.next();
    Remote remote=new Remote(typeOfDevice);
    remote.togglePower();
    remote.channelUp();
    remote.volumeUp();

    }
}
