/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busiess.Admins;

import Business.Abstract.Admin;

/**
 *
 * @author Sumesh
 */
public class Admins extends Admin implements Comparable<Admins>{
    
    
    public Admins(String password, String userName) {
        super(password, userName);
    }

    @Override
    public int compareTo(Admins o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
