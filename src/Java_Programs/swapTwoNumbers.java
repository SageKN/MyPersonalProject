package Java_Programs;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a number");
        int a = reader.nextInt();
        System.out.println("plz enter b number");
        int b = reader.nextInt();

        //Logic 1: Using third variable:
        int c =b;
        b =a;
        a=c;
        System.out.println("value of a now is: " + a);
        System.out.println("value of b now is: " + b);

        //Logic 2: Using + and -, without using third variable:
        a = a+b;
        b = a-b;
        a = a-b;

        //Logic 3: Using multiplication (*) and division (/) operator, without using third variable:
        //Here a and b should not be Zero (0)
        a=a*b;
        b=a/b;
        a=a/b;

        //Logic 4: Using bitwise XOR (^)
        a=a^b;
        b=a^b;
        a=a^b;
    }
}
