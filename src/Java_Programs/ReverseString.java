package Java_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a number");
        String num = reader.next();
        method1(num);
        method2(num);
        method3(num);
    }

    //Logic 1: Using Algorithm:
    public static void method1(String num) {

        System.out.println("Reverse number is : " );
    }

    //Logic 2: Using StringBuffer class:
    public static void method2(String num) {
    StringBuffer rev;
    StringBuffer sb = new StringBuffer(String.valueOf(num));

    rev = sb.reverse();
    System.out.println("Reverse number is : " + rev);
    }

    //Logic 3: Using StringBuilder class:
    public static void method3(String num) {
        StringBuilder rev;
        StringBuilder sb = new StringBuilder();

        sb.append(num);
        rev = sb.reverse();
        System.out.println("Reverse number is : " + rev);
    }
}
