package PrototypePattern;

import java.util.HashMap;

public class ShapePrototypeRegistry {
    public HashMap<String, Shape> shapeCache = new HashMap<>();

    public ShapePrototypeRegistry(){
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 15;
        circle1.radius = 20;
        circle1.color = "RED_REGISTRY";

        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 20;
        rectangle.color = "BLUE";

        shapeCache.put("CIRCLE",circle1);
        shapeCache.put("RECTANGLE",rectangle);
    }
}
