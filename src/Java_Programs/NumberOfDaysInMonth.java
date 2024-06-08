package Java_Programs;

public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year){
        if (year>=1 && year <=9999){
            if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        boolean leap = isLeapYear(year);
        int intMonth = -1;
        if(!leap && year >=1 && year <=9999){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return intMonth=31;
                case 4: case 6: case 9: case 11:
                    return intMonth=30;
                case 2:
                    return intMonth =28;
                default:
                    return intMonth=-1;
            }
        }
        else if(leap && year >=1 && year <=9999){
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return intMonth=31;
                case 4: case 6: case 9: case 11:
                    return intMonth=30;
                case 2:
                    return intMonth=29;
                default:
                    return intMonth=-1;
            }
        }
        return intMonth;
    }
}
