/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Phuc Anh
 */
public class Category {
    private String CategoryID;
	private String CategoryName;
	private String Link;
	
	public String getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}
	
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
}
