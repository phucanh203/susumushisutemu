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
public class Application {
    private String Name;
	private String CategoryID;
	private String Description;
	private String Version;
	public Application() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
        return Name;
    }
	public void setName(String name) {
        this.Name = name;
    }
	public String getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(String categoryID) {
		CategoryID = categoryID;
	}
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
}
