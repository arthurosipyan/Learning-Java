package Interviews.AmariSave;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q2 {
//    Write Java code that defines an array, loads it with some data,
//    and then loops through the members of that array. Do the same for a HashMap.

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "Arthur");
        students.put(2, "Joe");
        students.put(3, "Emma");
        students.put(4, "George");

        Iterator studentsIterator = students.entrySet().iterator();

        for (int j : arr) {
            System.out.println(j);
        }

        // Map.Entry mapElement = (Map.Entry)hmIterator.next();
        //            int marks = ((int)mapElement.getValue() + 10);
        //            System.out.println(mapElement.getKey() + " : " + marks);

        while(studentsIterator.hasNext()){
            Map.Entry studentElement = (Map.Entry)studentsIterator.next();
            String studentName = ((String)studentElement.getValue());
            System.out.println(studentElement.getKey() + " : " + studentName);
        }

    }
}
