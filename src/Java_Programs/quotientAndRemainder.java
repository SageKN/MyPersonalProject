package Java_Programs;

import java.util.Scanner;

public class quotientAndRemainder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a dividend");
        int a = reader.nextInt();
        System.out.println("plz enter a divisor");
        int b = reader.nextInt();
        float c =(float) a/b;
        float d =(float) a%b;
        System.out.println("quotient is: " + a/b + " and " + c);
        System.out.println("remainder is: " + a%b + " and " + d);
    }
}
