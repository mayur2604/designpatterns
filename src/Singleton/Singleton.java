package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("constructor called");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
