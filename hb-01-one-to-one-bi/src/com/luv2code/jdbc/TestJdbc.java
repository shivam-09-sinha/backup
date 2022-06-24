package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String args[])
    {
        String jdbcUrl="jdbc:mysql://127.0.0.1:3306/hb-01-one-to-one-uni?useSSL=false&characterEncoding=latin1";
        String user="root";
        String pass="root@123";
        try
        {
            System.out.println("connecting to database: "+jdbcUrl);
            Connection myConn= DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connection successfull");

        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }
}
