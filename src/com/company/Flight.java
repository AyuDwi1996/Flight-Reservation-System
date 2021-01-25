package com.company;

public class Flight {
     public long flightNo;
     public String airlines;
     public int bookedSeats;
     public int totalSeats;
    public Flight(long flightNo,String airlines,int bookedSeats,int totalSeats){
        this.flightNo = flightNo;
        this.airlines = airlines;
        this.bookedSeats = bookedSeats;
        this.totalSeats = totalSeats;
    }
    public long getFlightNo() {
        return (flightNo);
    }
    public String getAirlines() {
        return (airlines);
    }
    public int seatsAvailability() {
        return (totalSeats-bookedSeats);
    }
    public void updateSeats() {
        bookedSeats = bookedSeats+1;
    }
}
