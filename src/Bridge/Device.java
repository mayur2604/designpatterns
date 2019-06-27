package BridgeDesignPattern;

public abstract class Device {
    protected String power="off";
     protected int channel=0;
    protected int volume=0;
    abstract boolean isEnabled();
abstract void enable();
abstract void disable();
abstract int getChannel();
abstract void setChannel(int channel);
abstract int getVolume();
abstract void setVolume(int volume);
}
