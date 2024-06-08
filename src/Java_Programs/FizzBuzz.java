package Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
    public static void main(String[] args) {
        FizzBuzz testCount = new FizzBuzz();
        System.out.println(testCount.fizzBuzz(15));
    }
    public List<String> fizzBuzz(int n) {
        List<String> arr= new ArrayList<String>(n);
        for(int i=1;i<=n;i++){
            boolean divisibleBy3 = i %3==0;
            boolean divisibleBy5 = i %5==0;
            if(divisibleBy3 && divisibleBy5){
                arr.add("FizzBuzz");
            }
            else if(divisibleBy3){
                arr.add("Fizz");
            }
            else if(divisibleBy5){
                arr.add("Buzz");
            }
            else{
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }
}