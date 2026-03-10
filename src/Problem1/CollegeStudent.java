package Problem1;

public class CollegeStudent extends Student{
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, int idNumber, int gpa, int year, String major){
        super(name,age,gender,idNumber,gpa);
        myYear = year;
        myMajor = major;
    }

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

    public String toString(){
        return super.toString() + ", major: " + myMajor + ", year: " + myYear;
    }
}
