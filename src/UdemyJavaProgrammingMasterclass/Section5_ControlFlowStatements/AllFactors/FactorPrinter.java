package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.AllFactors;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }

        int i = 1;

        while(i <= number){
            if(number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
