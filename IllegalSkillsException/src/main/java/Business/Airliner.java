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
public class Airliner {
    private String airlinerName;
    private String airlinerHeadquaters;
    private int airlinerFleetSize;
    public ArrayList<Flight> flightList;

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerHeadquaters() {
        return airlinerHeadquaters;
    }

    public void setAirlinerHeadquaters(String airlinerHeadquaters) {
        this.airlinerHeadquaters = airlinerHeadquaters;
    }

    public int getAirlinerFleetSize() {
        return airlinerFleetSize;
    }

    public void setAirlinerFleetSize(int airlinerFleetSize) {
        this.airlinerFleetSize = airlinerFleetSize;
    }
}
