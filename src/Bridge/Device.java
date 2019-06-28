package BridgeDesignPattern;

public abstract class Device {
    protected String power = "off";
    protected int channel = 0;
    protected int volume = 0;

    abstract boolean isEnabled();

    abstract void enable();

    abstract void disable();

    abstract public int getChannel();

    abstract public void setChannel(int channel);

    abstract public int getVolume();

    abstract public void setVolume(int volume);
}
