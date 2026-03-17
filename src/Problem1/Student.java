package Problem1;

public class Student extends Person {
    //Instance variables
    protected String myIdNumber;
    protected double myGPA;

    //Constructor
    public Student(String name, int age, String gender, String idNumber, double gpa){
        super(name,age,gender);
        myIdNumber = idNumber;
        myGPA = gpa;
    }

    //Getters and setters
    public String getMyIdNumber() {
        return myIdNumber;
    }

    public void setMyIdNumber(String myIdNumber) {
        this.myIdNumber = myIdNumber;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    // toString method
    public String toString(){
        return super.toString() + ", ID Number: " + myIdNumber + ", GPA: " + myGPA;
    }
}
