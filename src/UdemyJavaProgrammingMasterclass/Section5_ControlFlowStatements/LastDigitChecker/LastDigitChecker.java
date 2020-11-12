package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.LastDigitChecker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            int xlastDigit = x % 10;
            int ylastDigit = y % 10;
            int zlastDigit = z % 10;

            return (xlastDigit == ylastDigit || xlastDigit == zlastDigit || ylastDigit == zlastDigit);
        }
        return false;
    }

    public static boolean isValid(int num){
        return 10 <= num && 1000 >= num;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}
