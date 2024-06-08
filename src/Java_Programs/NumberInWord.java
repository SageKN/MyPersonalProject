package Java_Programs;

public class NumberInWord {
    // write your code here

    public static String printNumberInWord(int number){
        String word;
        switch (number) {
            case 0: case 1:
                word = "ZERO";
                break;
            /*case 1:
                word = "ONE";
                break;*/
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;
        }
        return word;
    }
}