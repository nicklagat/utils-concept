package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public final class DbUtils {


    private DbUtils() {
    }

    ;

    public static Connection connectDb(String dbName, String username, String password) {

        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://ims-db.local:5432/" + dbName, username, password);

            if (conn != null) {

                System.out.println("Connected to the database successfully");

            } else {
                System.out.println("Connection to the database has failed");
            }


        } catch (Exception e) {
            System.out.println(e);
        };


        return conn;
    }
}
