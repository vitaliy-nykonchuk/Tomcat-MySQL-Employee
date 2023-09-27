package org.example.app.utils;

import org.example.app.credentials.Credentials;

public class Constants {

    private Constants(){
    }

    public final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/";
    public final static String DB_NAME = "demo_db";
    public final static String DB_USER = "root";
    public final static String DB_PASS = Credentials.DB_PASS;
}
