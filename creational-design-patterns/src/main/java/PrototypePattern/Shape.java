package PrototypePattern;

import java.util.Objects;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
    }

    public Shape(Shape target){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
    }

    public abstract Shape clone();
}
