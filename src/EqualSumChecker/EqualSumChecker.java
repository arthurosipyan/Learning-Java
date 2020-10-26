package EqualSumChecker;

public class EqualSumChecker {

    public static boolean hasEqualSum(int x, int y, int z){
        return x + y == z;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}