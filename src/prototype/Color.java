package prototype;

abstract public class Color implements Cloneable {
    private String colorName;

    abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
