package BridgeDesignPattern;

public class Tv extends Device {
    @Override
    public void disable() {
        power = "off";
    }

    @Override
    void enable() {
        power = "on";
    }

    @Override
    public boolean isEnabled() {
        if (power.equals("on"))
            return true;
        return false;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 0 && channel < 300)
            this.channel = channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume < 20)
            this.volume = volume;
    }
}
