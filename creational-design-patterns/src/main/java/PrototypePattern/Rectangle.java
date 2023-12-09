package PrototypePattern;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        this.width = target.width;
        this.height = target.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
