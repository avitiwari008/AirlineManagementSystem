/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aviti
 */
public class AirlinerSchedule {
    
    private String Airline;
    private String flightNumber;
    private String departureLocation;
    private String arrivalLocation;
    private String timeofDay;
    private String date;
    public String seatSelection;
    
    
private AirlinerScheduleDirectory airlineScheduleDirectory;

  public AirlinerSchedule(){
    
    airlineScheduleDirectory = new AirlinerScheduleDirectory();
    
   
    }



    public String getSeatSelection() {
        return seatSelection;
    }

    public void setSeatSelection(String[] s) {
        this.seatSelection = seatSelection;
    }
    


    public String getDate() {
        return date;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
  public AirlinerScheduleDirectory getAirlineScheduleDirectory() {
        return airlineScheduleDirectory;
    }

    public void setAirlineScheduleDirectory(AirlinerScheduleDirectory airlineScheduleDirectory) {
        this.airlineScheduleDirectory = airlineScheduleDirectory;
    }
    
    
    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

   
    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getTimeofDay() {
        return timeofDay;
    }

    public void setTimeofDay(String timeofDay) {
        this.timeofDay = timeofDay;
    }

    
    
    
   @Override
    public String toString() {
        return Airline;
    }

        
    
}
