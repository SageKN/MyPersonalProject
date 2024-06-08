package Java_Programs;

import java.util.Scanner;

public class ReverseTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a number");
        int num = reader.nextInt();
        method1(num);
        method2(num);
        method3(num);
    }

    //Logic 1: Using Algorithm:
    public static void method1(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse number is : " + rev);
    }

    //Logic 2: Using StringBuffer class:
    public static void method2(int num) {
    StringBuffer rev;
    StringBuffer sb = new StringBuffer(String.valueOf(num));

    rev = sb.reverse();
    System.out.println("Reverse number is : " + rev);
    }

    //Logic 3: Using StringBuilder class:
    public static void method3(int num) {
        StringBuilder rev;
        StringBuilder sb = new StringBuilder();

        sb.append(num);
        rev = sb.reverse();
        System.out.println("Reverse number is : " + rev);
    }
}
