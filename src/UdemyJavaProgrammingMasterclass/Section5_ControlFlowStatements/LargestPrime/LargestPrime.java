package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.LargestPrime;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int i = 2;

        while(i < number){
            if(number % i == 0){
                number /= i;
                continue;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
