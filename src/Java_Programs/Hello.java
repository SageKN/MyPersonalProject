package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class Hello {
    public static void main(String[] str){
        String input = "APYPLEPA";
        int counter= 0;
        StringBuilder input2 = new StringBuilder();
        Set<Character> store = new HashSet<Character>();

            for(int i=0; i< input.length(); i++){
                char c = input.charAt(i);
                boolean check = store.add(c);
                if (!check && counter ==0){
                    int in = input2.toString().indexOf(c);
                    input2.deleteCharAt(in);
                    input2.append(c);
                    counter =1;
                }
                else {
                    input2.append(c);
                }
            }
        // print new String
        System.out.println(input2);
    }
}
