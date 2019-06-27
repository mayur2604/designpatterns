package BridgeDesignPattern;

public class Remote {
    Device device=null;
    Remote(String type){
        if(type.equals("tv")){
            device=new Tv();
        }
    }
    void togglePower(){
        if(device.isEnabled())
            device.disable();
        else device.enable();
    }
    void volumeUp(){
        device.setVolume(device.getVolume()+1);
        System.out.println(device.getVolume());
    }
    void volumeDown(){
        device.setVolume(device.getVolume()-1);
        System.out.println(device.getVolume());
    }
    void channelUp(){
        device.setChannel(device.getChannel()+1);
        System.out.println(device.getChannel());
    }
    void channelDown(){
        device.setChannel(device.getChannel()-1);
        System.out.println(device.getChannel());
    }
}
