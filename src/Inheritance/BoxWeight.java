package Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(Box oldBox, double weight) {
        super(oldBox);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // Q. What is super ?
        //Ans. Call the parent class constructor
        // used to initialize values in parent class constructor
        this.weight = weight;
    }
}
