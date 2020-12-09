package UdemyJavaProgrammingMasterclass.Section5_ControlFlowStatements.FlourPacker;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        return bigCount >= 0 && smallCount >= 0 && goal >= 0 && (bigCount * 5 + smallCount >= goal) && (smallCount >= goal % 5);
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
