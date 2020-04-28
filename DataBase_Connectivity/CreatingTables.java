package DataBase_Connectivity;

import java.sql.*;
import java.util.*;

public class CreatingTables {

    public static void main(String[] args) throws SQLException {

        //Creating connection to Database using URL, USER NAME and PASSWORD
        String url = "jdbc:postgresql://localhost:5432/sales";
        String user = null;// Enter your Username
        String password = null; // Enter your Password

        Connection connect = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement st = connect.createStatement();

        // Using the executeUpdate Method to create a new table.
        st.executeUpdate("Create Table Test3(id int primary key, name varchar, address text)");

        System.out.println("Table Created");

        // Closing the connections made
        st.close();
        connect.close();
    }


}
