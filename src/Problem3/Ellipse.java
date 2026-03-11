package Problem3;

public class Ellipse extends Shape {
    // Instance variables
    private double majorAxes = 0.0;
    private double minorAxes = 0.0;

    //Constructors
    public Ellipse(){
    }

    public Ellipse(String name, double a, double b){
        super(name);
        if(a>b){
            this.majorAxes = a;
            this.minorAxes = b;
        } else {
            this.majorAxes = b;
            this.minorAxes = a;
        }
    }

    //Getters and setters
    public double getMajorAxes() {
        return majorAxes;
    }

    public void setMajorAxes(double majorAxes) {
        this.majorAxes = majorAxes;
    }

    public double getMinorAxes() {
        return minorAxes;
    }

    public void setMinorAxes(double minorAxes) {
        this.minorAxes = minorAxes;
    }

    // Implementing inherited methods
    @Override
    public double getArea() {
        return Math.PI*(majorAxes*minorAxes);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*Math.sqrt(2*(majorAxes*majorAxes+minorAxes*minorAxes)-((majorAxes-minorAxes)*(majorAxes-minorAxes)/2));
    }

    // toString method
    public String toString(){
        return super.toString();
    }
}
