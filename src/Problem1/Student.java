package Problem1;

public class Student extends Person {
    protected String myIdNumber;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNumber, double gpa){
        super(name,age,gender);
        myIdNumber = idNumber;
        myGPA = gpa;
    }

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
}
