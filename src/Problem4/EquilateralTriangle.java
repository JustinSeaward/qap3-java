package Problem4;

import Problem4.Shape;

public class EquilateralTriangle extends Shape {
    //Instance variables
    private double side1;
    private double side2;
    private double side3;

    //Constructors
    public EquilateralTriangle(){

    }

    public EquilateralTriangle(String name, double side1, double side2, double side3){
        super(name);
        if(side1 == side2 && side2 == side3 && side3 == side1){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Length of sides will not create a equilateral triangle");
            System.exit(1);
        }
    }

    // Getter and setter
    public void setSideLength(double side){
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

    public double getSideLength(){
        return this.side1;
    }

    // Implementing inherited methods
    @Override
    public double getArea() {
        double semiPerimeter;
        semiPerimeter = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-this.side1)*(semiPerimeter-this.side2)*(semiPerimeter-side3));
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;

    }

    // toString method
    public String toString(){
        return super.toString();
    }

    @Override
    public void scale(double factor) {
        this.side1 = this.side1 * factor;
        this.side2 = this.side2 * factor;
        this.side3 = this.side3 * factor;
    }
}
