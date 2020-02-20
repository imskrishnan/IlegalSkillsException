/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sumesh
 */
public class AirlinerDirectory {
    public ArrayList<Airliner> airlinerList;
   
     public AirlinerDirectory()
    {
        this.airlinerList = new ArrayList<Airliner>();
        
    } 

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }

    public Airliner addAirliner(String airlinerName) {
       Airliner airliner = new Airliner(airlinerName);
       airlinerList.add(airliner);
       return airliner;
    }
    
    public void deleteAirliner(Airliner airliner){
        airlinerList.remove(airliner);
    }
    
    public Airliner searchAirliner(String airlinerName){
        for(Airliner airliner:airlinerList) {
            if(airliner.getAirlinerName().equalsIgnoreCase(airlinerName)) {
                return airliner;
            }
        }
        return null;
    }
}
