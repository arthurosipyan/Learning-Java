package Interviews.AmariSave;

public class Q1 {
//    1. Write a function in Java that takes a string as its input and prints the letters in that
//    string in reverse order, with the letters in the odd-numbered positions in upper-case and the
//    letters in even-numbered positions in lower case.

    public static String reversedString(String str){
        String newStr = "";
        for(int i = str.length(); i > 0; i--) {
            if(i % 2 == 0){
                // even, lower case letter
                char evenChar = Character.toLowerCase(str.charAt(i-1));
                //System.out.println(evenChar);
                newStr += evenChar;
            }
            else{
                // odd, upper case letter
                char oddChar = Character.toUpperCase(str.charAt(i-1));
                //System.out.println(oddChar);
                newStr += oddChar;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        // Test Case 1:
        System.out.println(reversedString("moon"));
        //                                 0123
    }
}
