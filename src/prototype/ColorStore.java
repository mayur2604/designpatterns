package prototype;

import java.util.*;

public class ColorStore {
    Map<String, Color> colors = new HashMap<>();

    {
        colors.put("blue", new BlueColor());
        colors.put("black", new BlackColor());
    }

    Color getColor(String name) {
        return (Color) colors.get(name).clone();
    }
}
