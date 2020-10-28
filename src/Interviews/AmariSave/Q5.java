//package Interviews.AmariSave;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Date;
//
//public class Q5 {
//
//    public getMaxOverlappingCalls(Date start, Date end){
//
//        try
//        { String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost/test";
//            Class.forName(myDriver);
//            Connection conn = DriverManager.getConnection(myUrl, "root", "");
//
//            // our SQL SELECT query.
//            String query = "SELECT PhoneNumber, count(*) as nums " +
//                           "FROM PhoneCalls " +
//                           "GROUP by PhoneNumber " +
//                           "WHERE start >= DateStart AND end <= DateEnd" +
//                           "ORDER by count(*) desc";
//
//            // create the java statement
//            Statement st = conn.createStatement();
//
//            // execute the query, and get a java resultset
//            ResultSet rs = st.executeQuery(query);
//
//            // iterate through the java resultset
//            while (rs.next())
//            {
//                int id = rs.getInt("CallId");
//                String phoneNum = rs.getString("PhoneNumber");
//
//                // print the results
//                System.out.format("%s, %s\n", id, phoneNum);
//            }
//            rs.getRow();
//            st.close();
//        }
//        catch (Exception e)
//        {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
//    }
//}
