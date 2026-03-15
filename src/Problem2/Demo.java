package Problem2;

public class Demo {
    public static void main (String[] args){

        MovablePoint myPoint = new MovablePoint(10,20,50,60);
        System.out.println();
        System.out.println("My Point: " + myPoint);

        myPoint.move();
        System.out.println("My Point moved: " + myPoint);


    }
}