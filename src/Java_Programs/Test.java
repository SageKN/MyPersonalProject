package Java_Programs;

public class Test {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0){
                steps+=1;
                num/=2;
            }
            else{
                steps+=1;
                num-=1;
                num/=2;
            }
        }
        return steps;
    }
}
