package Java_Programs;

import java.util.Scanner;

public class asciiNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("plz enter a character");
        char c = reader.next().charAt(0);
        int num = (int)c;
        System.out.println(c);
        System.out.println(num);
    }
}
