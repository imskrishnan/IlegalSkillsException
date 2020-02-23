/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.Admin;

/**
 *
 * @author Sumesh
 */
public class TravelAgency extends Admin{
    private AirlinerDirectory airlinerDirectory;
    private CustomerDirectory customerDirectory;
    private AdminDirectory adminDir;
    
     public TravelAgency()
    {
        super("","Admin");
      this.airlinerDirectory = new AirlinerDirectory();
      this.customerDirectory = new CustomerDirectory();
      this.adminDir = new AdminDirectory();
    }

    public AdminDirectory getAdminDir() {
        return adminDir;
    }

    public void setAdminDir(AdminDirectory adminDir) {
        this.adminDir = adminDir;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
