package Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(Box oldBox){
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

    //
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public void information(){
        System.out.println("running the Box");
    }
}
