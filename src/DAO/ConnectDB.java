/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phuc Anh
 */
public class ConnectDB {
    private static String url = "";

	private static String databaseName = "";

	private static String userName = "";

	private static String password = "";

	private static String serverName = "";

	private static String port = "";

	private static Connection conn = null;

	public static Connection Connect() {
		Config();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    try {
                        conn = DriverManager.getConnection(url, userName, password);
                    } catch (SQLException ex) {
                        Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	public static void Config() {
        serverName = "PHUCANH";
        port = "1433";
        databaseName = "AppStore";
        userName = "sa";
        password = "123456";

        url = "jdbc:sqlserver://" + serverName + ":" + port + ";databaseName=" + databaseName;

	}
}
