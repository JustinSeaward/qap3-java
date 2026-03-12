package Problem4;

public class Circle extends Shape{
    //Instance variable
    private double radius;

    // Constructors
    public Circle(){

    }

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }

    // Getter and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing inherited methods
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString(){
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        this.radius = this.radius * factor;
    }
}
