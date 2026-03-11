package Problem3;

public class Circle extends Shape{
    private double radius;

    public Circle(){

    }

    public Circle(String name){
        super(name);
    }

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}
