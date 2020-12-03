package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.GreatestCommonDivisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y){
        if(x < 10 || y < 10){
            return -1;
        }
        int i = 1;
        while(x % i == 0){
            if(y % i == 0){
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
