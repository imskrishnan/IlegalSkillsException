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
    public Airliner(String airlinerName, String airlinerHeadquaters){
        
       flightList = new ArrayList<Flight>();
       this.airlinerName = airlinerName;
       this.airlinerHeadquaters = airlinerHeadquaters;
       
        Flight flight1 = new Flight("Jet Blue","EM-1283", "DUBAI", "BOSTON", "20:00", "23:00", 450, 25);
        flightList.add(flight1);
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

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    public Flight addFlight(String airlinerName, String flightNumber, String source, String destination, String departureTime, String arrivalTime, double flightPrice, int totalSeats) {
       Flight flight = new Flight(airlinerName, flightNumber, source, destination, departureTime, arrivalTime, flightPrice, totalSeats);
       flightList.add(flight);
       return flight;
    }
    
    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }
     
     
    @Override
    public String toString() {
        return airlinerName;
    }
    
}
