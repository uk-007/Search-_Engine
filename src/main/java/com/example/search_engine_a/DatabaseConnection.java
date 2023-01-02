package com.example.search_engine_a;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class DatabaseConnection {

        String MySqlURL = "jdbc:mysql://localhost:3306/Search_Engine?useSSL=false";

        String DatabaseUserName = "root";

        String DatabasePassword = "273001";

        Connection con = null;

        DatabaseConnection()  throws SQLException{
            con = DriverManager.getConnection(MySqlURL,DatabaseUserName,DatabasePassword);
        }
        public ResultSet executeQuery(String query) throws SQLException{

                ResultSet ans = null;
                Statement statement = con.createStatement();
                ans = statement.executeQuery(query);

                return ans;
        }

        public int executeUpdate(String query) throws SQLException{

                int ans =0;
                Statement statement = con.createStatement();
                ans = statement.executeUpdate(query);

                return ans;
        }
}
