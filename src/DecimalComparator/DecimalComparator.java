package DecimalComparator;

public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces (double Value1, double Value2){
        return ((int) (Value1 * 1000)) == ((int) (Value2 * 1000));
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}