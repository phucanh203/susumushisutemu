/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Phuc Anh
 */
public class DataDao {
    public static Connection conn = null;
    public static  Statement st = null;
    public static ResultSet rs = null;

    public static ArrayList<Category> getAllCategory()
    {
    	ArrayList<Category> cates = new ArrayList<Category>(); 
    	conn = ConnectDB.Connect();
        String sql = "Select * From Category";
        
        try {
        	st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Category temp = new Category();
			    temp.setCategoryID(rs.getString(1));
			    temp.setCategoryName(rs.getString(2));
			    temp.setLink(rs.getString(3));
			    cates.add(temp);
			}
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	return cates;
    }
    
    public static void AddNewCategory(Category cate) {
    	conn = ConnectDB.Connect();
        String sql = "INSERT INTO Category(CategoryName,Link) values(?,?)";
        PreparedStatement ps;
        try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cate.getCategoryName());
	        ps.setString(2, cate.getLink());
	        if(ps.executeUpdate() == 1)
	        {
	        	System.out.println("Success!");
	        }
	        else {
	        	System.out.println("Fail!");
	        }
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }

    public static void AddNewApp(Application app) {
    	conn = ConnectDB.Connect();
        String sql = "Insert Into Application(Name,CategoryID, Description, Version) values(?,?,?,?)";
        PreparedStatement ps;
        try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, app.getName());
			ps.setString(2, app.getCategoryID());
	        ps.setString(3, app.getDescription());
	        ps.setString(4, app.getVersion());
	        if(ps.executeUpdate() == 1)
	        {
	        	System.out.println("Success!");
	        }
	        else {
	        	System.out.println("Fail!");
	        }
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

    }
}
