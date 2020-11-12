package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.SumOdd;

public class SumOddRange {
    public static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        if(end >= start && start > 0){
            int sum = 0;
            for(int i = start; i <= end; i++){
                sum += isOdd(i) ? i : 0;
            }
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}
