package Problem1;

public class Student extends Person {
    protected int myIdNumber;
    protected double myGPA;

    public Student(String name, int age, String gender, int idNumber, double gpa){
        super(name,age,gender);
        myIdNumber = idNumber;
        myGPA = gpa;
    }

    public int getMyIdNumber() {
        return myIdNumber;
    }

    public void setMyIdNumber(int myIdNumber) {
        this.myIdNumber = myIdNumber;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
