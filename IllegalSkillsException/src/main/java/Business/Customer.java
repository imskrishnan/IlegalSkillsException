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
public class Customer {
    String custName;
    long custContact;
    String custEmail;
    private String seatNumber;
    private String flightNumber;
    private ArrayList<AirlinerDirectory> airlinerDirectory;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustContact() {
        return custContact;
    }

    public void setCustContact(long custContact) {
        this.custContact = custContact;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public ArrayList<AirlinerDirectory> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<AirlinerDirectory> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

}
