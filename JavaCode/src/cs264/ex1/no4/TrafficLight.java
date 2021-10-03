package cs264.ex1.no4;

// Use Singleton pattern with double-checked locking to write a singleton class TrafficLight
// to generate three objects of Light class representing red, yellow and green lights, respectively.
// Write a Test class to test the TrafficLight class.
// Hint: you can use a map to store singleton objects.

import java.util.HashMap;
import java.util.Map;

public class TrafficLight {
    private TrafficLight() {}
    private static Map<String, Light> map = null;

    public static Light getTrafficLight(String light) {
        if (map == null) {
            synchronized (TrafficLight.class) {
                if (map == null) {
                    map = new HashMap<>();
                    map.put("red", new Light("red"));
                    map.put("yellow", new Light("yellow"));
                    map.put("green", new Light("green"));
                }
            }
        }
        return map.get(light);
    }
}
class Light {
    String col;
    public Light(String col) {
        this.col = col;
    }
}