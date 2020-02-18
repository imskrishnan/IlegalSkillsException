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
//        Airliner airliner1 = new Airliner("Jet Blue", "Canada");
////        Airliner airliner2 = new Airliner("Air India", "India");
////        Airliner airliner3 = new Airliner("Delta", "Atlanta");
//        airlinerList.add(airliner1);
////        airlinerList.add(airliner2);
////        airlinerList.add(airliner3);
    } 

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }

    public Airliner addAirliner(String airlinerName, String airlinerHeadquaters) {
       Airliner airliner = new Airliner(airlinerName, airlinerHeadquaters);
       airlinerList.add(airliner);
       return airliner;
    }
}
