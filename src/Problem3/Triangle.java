package Problem3;

public class Triangle extends Shape{
    // Instance variables
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructors
    public Triangle(){

    }

    public Triangle(String name, double sideA, double sideB, double sideC){
        super(name);
        if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideB){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Values will not make a triangle");
            System.exit(1);
        }

    }

    //Getters and setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    // Implementing inherited methods
    @Override
    public double getArea() {
        double semiPerimeter;
        semiPerimeter = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-this.sideA)*(semiPerimeter-this.sideB)*(semiPerimeter-sideC));
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;

    }

    // toString method
    public String toString(){
        return super.toString();
    }

}
