package Problem1;

public class Student extends Person {
    protected String myIdNumber;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNumber, double gpa){
        super(name,age,gender);
        myIdNumber = idNumber;
        myGPA = gpa;
    }

}
