package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);

        Box box1 = new Box(1,2, 3);
        Box box2 = new Box(2,3,4);
        Box box3 = new Box(box1);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);

        BoxWeight boxWeight = new BoxWeight();
        System.out.println(boxWeight.l + " " + boxWeight.w + " " + boxWeight.h + " " + boxWeight.weight);

    }
}
