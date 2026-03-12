package Problem4;

public abstract class Shape implements Scalable {
    // Instance variable
    private String name;

    // Constructors
    public Shape(){
    }

    public Shape(String name){
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString method
    public String toString(){
        return "Name: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
    }
}