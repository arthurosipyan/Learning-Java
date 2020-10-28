package UdemyJavaProgrammingMasterclass.Section4.MinutesToYearsAndDaysCalculator;

public class MinutesToYearsDaysCalculator {


    public static void printYearsAndDays(long minutes){
        if(minutes >= 0){
            long days = minutes / 1440;
            long years = days/365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        }else{
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}