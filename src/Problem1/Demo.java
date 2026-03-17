package Problem1;

public class Demo {
    public static void main(String[] args){
        // new person object
        Person bob = new Person("Coach Bob", 27, "M");
        // new Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        // new teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        // new collegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

        // Output for each object created
        System.out.println();
        System.out.println(bob);
        System.out.println(lynne);
        System.out.println(mrJava);
        System.out.println(ima);

    }
}
