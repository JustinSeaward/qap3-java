package Problem1;

public class CollegeStudent extends Student{
    // Instance variables
    protected String myMajor;
    protected int myYear;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major){
        super(name,age,gender,idNumber,gpa);
        myYear = year;
        myMajor = major;
    }

    //Getters and setters
    public int getMyYear() {
        return myYear;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    public String getMyMajor() {
        return myMajor;
    }

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    // toString method
    public String toString(){
        return super.toString() + ", major: " + myMajor + ", year: " + myYear;
    }
}
