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
public class Flight {
    
    private String airlinerName;
    private String flightNumber;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double flightPrice;
    private int totalSeats;
    private int availableSeats;
    private ArrayList<Seats> seatList;
    private Seats seat;   
    
    public Flight(String airlinerName,String flightNumber,String source,String destination,String departureTime,String arrivalTime,double flightPrice,int totalSeats ){
        seatList = new ArrayList<>();
        this.airlinerName = airlinerName;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime =arrivalTime;
        this.flightPrice = flightPrice;
        this.totalSeats = totalSeats;
        seatList=createSeats(totalSeats);
        this.availableSeats = totalSeats;       
    }
    
    public ArrayList<Seats> createSeats(int totalSeats){
        int numCols = 6;
        int rows = 0;
        int cols = 1;
        char col;
        String window = "Window";
        String middle = "Middle";
        String aisle = "Aisle";
        
        String seatNumber;
        while (rows < Math.floor(totalSeats/numCols)) {
            rows++;
            cols=1;
            col='A';
        while (cols <= numCols) {
            seat = new Seats();
            String column = String.valueOf(col);
            String row = String.valueOf(rows);
            seatNumber = row + column;            
            seat.setSeatNumber(seatNumber);
                switch (col) {
                    case 'A':
                    case 'F':
                        seat.setSeatPosition(window);
                        break;
                    case 'B':
                    case 'E':
                        seat.setSeatPosition(middle);
                        break;
                    default:
                        seat.setSeatPosition(aisle);
                        break;
                }
            seat.setSeatAvailability(true);
           
            col++;
            cols++;
            seatList.add(seat);
        }
        
    }
          
        return seatList;
    }
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public ArrayList<Seats> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seats> seatList) {
        this.seatList = seatList;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }
    
    public String toString(){
        return this.flightNumber;
    }
    
}
