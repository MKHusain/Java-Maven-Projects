package DataBase_Connectivity;

import java.sql.*;

public class Postgress_Connection {

    //Creating 3 Private constants for Connecting using  the Url, UserName and Password to Psql.

    private final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private final String user = null; //Enter your User Name
    private final String password = null; // Enter your Password.

    // Making a Connect Method.

    public Connection Connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);

    }

    // Passing the Connection and making Querys.
    public static void makeQuery(Connection con, String query) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){

            System.out.println(rs.getString(1) + " " + rs.getString(2));

        }
        rs.close();
        st.close();

    }

    /*Calling in the Connection through object.
    *Passing the query by try , catch block while handling the exceptions.
    * */

    public static void main(String[] args) {

        Postgress_Connection psqlconnection = new Postgress_Connection();

       try {
           Connection conn = psqlconnection.Connect();

           makeQuery(conn, "Select * from actor limit 5");

       } catch (Exception e){
           e.getMessage();
       }

    }
}
