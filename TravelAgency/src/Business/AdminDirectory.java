/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.Admin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sumesh
 */
public class AdminDirectory {
 
    private List<Admin> adminList;
    
    public AdminDirectory(){
        adminList = new ArrayList<>();
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }
   
}
