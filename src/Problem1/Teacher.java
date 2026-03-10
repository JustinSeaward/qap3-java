package Problem1;

public class Teacher extends Person{
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name,age,gender);
        mySubject = subject;
        mySalary = salary;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double salary) {
        this.mySalary = salary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String subject) {
        this.mySubject = subject;
    }

    public String toString(){
            return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }


}
