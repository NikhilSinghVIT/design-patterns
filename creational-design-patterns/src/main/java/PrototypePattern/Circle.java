package PrototypePattern;

public class Circle extends Shape {
    int radius;

    public Circle(){

    }

    public Circle(Circle target){
        super(target);
        this.radius = target.radius;
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
