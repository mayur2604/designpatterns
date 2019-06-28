package BridgeDesignPattern;

public class Remote {
    Device device = null;

    public Remote(String type) {
        if (type.equals("tv")) {
            device = new Tv();
        }
    }

    public void togglePower() {
        if (device.isEnabled())
            device.disable();
        else device.enable();
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
        System.out.println(device.getVolume());
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
        System.out.println(device.getVolume());
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
        System.out.println(device.getChannel());
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
        System.out.println(device.getChannel());
    }
}
