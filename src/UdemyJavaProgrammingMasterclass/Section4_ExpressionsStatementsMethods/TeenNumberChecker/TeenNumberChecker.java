package UdemyJavaProgrammingMasterclass.Section4_ExpressionsStatementsMethods.TeenNumberChecker;

public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z){
        return 13 <= x && x <= 19 || 13 <= y && y <= 19 || 13 <= z && z <= 19;
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}