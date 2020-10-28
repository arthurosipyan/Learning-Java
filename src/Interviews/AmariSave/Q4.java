package Interviews.AmariSave;

public class Q4 {

//    What would be the output produced by the main method in Fig. 1?
//
//    If it will print True, why?
//
//    If it will print False, why?

        public static void main(String[] args) {
            String s1 = "AmeriSave";
            String s2 = "AmeriSave";

            s1.toUpperCase();
            String s = s1.toUpperCase();

            if (s1 == s2) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
}

