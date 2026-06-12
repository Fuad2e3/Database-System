package com.softece.ims;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseQuery {

    public static void registrationDataSaveToDatabase(int userNumber,String  userName) {
        String sql = "INSERT INTO registration(Name, Account_number) VALUES(?, ?);";
        try  {
            Connection conn = DatabaseConnector.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            System.out.println("Username: " + userName);
            System.out.println("UserNum: " + userNumber);

            stmt.setString(1, userName);
            stmt.setInt(2, userNumber);

            System.out.println("Query : " + stmt);

            System.out.println("try try");
            int statement = stmt.executeUpdate();

            if (statement < 0){
                System.out.println("Statement failed");
            }
            System.out.println("Data inserted");

        }
        catch (SQLException s){
            System.out.println("SQL error");
        }
    }
}
