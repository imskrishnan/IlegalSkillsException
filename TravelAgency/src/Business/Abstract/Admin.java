/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

/**
 *
 * @author Sumesh
 */
public abstract class Admin {
    private String password;
    private String userName;    

    public Admin (String password, String userName) {
        this.password = password;
        this.userName = userName;        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public abstract boolean verify(String password);
    @Override
    public String toString() {
        return getUserName();
    }
    
}
