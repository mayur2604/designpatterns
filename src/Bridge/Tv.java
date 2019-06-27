package BridgeDesignPattern;

public class Tv extends Device {
    @Override
    public void disable() {
    power="off";
    }

    @Override
    void enable() {
    power="on";
    }

    @Override
    boolean isEnabled() {
        if(power.equals("on"))
            return true;
        return false;
    }

    @Override
    int getChannel() {
        return channel;
    }

    @Override
    void setChannel(int channel) {
        if(channel>=0 && channel<300)
        this.channel=channel;
    }

    @Override
    int getVolume() {
        return volume;
    }

    @Override
    void setVolume(int volume) {
        if(volume>=0 && volume<20)
        this.volume=volume;
    }
}
