package com.sdet.assignments.six.question_2;

import java.awt.*;
import java.util.HashMap;

public class ColorHashMap {
    private static final HashMap<String, Color> colorMap = new HashMap<>();

    static {

        colorMap.put("red", Color.RED);
        colorMap.put("green", Color.GREEN);
        colorMap.put("blue", Color.BLUE);
        colorMap.put("yellow", Color.YELLOW);
        colorMap.put("cyan", Color.CYAN);
        colorMap.put("magenta", Color.MAGENTA);
        colorMap.put("orange", Color.ORANGE);
        colorMap.put("pink", Color.PINK);
        colorMap.put("white", Color.WHITE);
        colorMap.put("gray", Color.GRAY);
        colorMap.put("lightGray", Color.LIGHT_GRAY);
        colorMap.put("darkGray", Color.DARK_GRAY);
        colorMap.put("black", Color.BLACK);
    }

    public static Color getColor(String colorName) {
        return colorMap.get(colorName.toLowerCase());

    }
}
