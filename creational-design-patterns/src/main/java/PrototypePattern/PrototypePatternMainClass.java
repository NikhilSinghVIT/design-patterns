package PrototypePattern;

public class PrototypePatternMainClass {
    public static void main(String args[]){
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 11;
        circle1.radius = 20;
        circle1.color = "RED";



        Circle circle2 = (Circle) circle1.clone();
        circle1.x = 12; //deep copy
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        ShapePrototypeRegistry shapePrototypeRegistry = new ShapePrototypeRegistry();
        System.out.println(shapePrototypeRegistry.shapeCache.get("CIRCLE").clone().toString());
    }
}
