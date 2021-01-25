package com.company;

public abstract class Ticket {
    public long PNR;
    public String depLocation;
    public String arrLocation;
    public Flight f;
    public String DateTimeArrival;
    public String DateTimeDeparture;
    public Passenger P;
    public int seatNo;
    public float price;
    public int journeyDuration;
    public boolean status= true;

    public Ticket(long PNR,String depLocation,String arrLocation, String DateTimeArrival, String DateTimeDeparture,
                  int seatNo,float price,int journeyDuration){
        this.PNR = PNR;
        this.depLocation = depLocation;
        this.arrLocation = arrLocation;
        this.DateTimeDeparture = DateTimeDeparture;
        this.DateTimeArrival = DateTimeArrival;
        this.seatNo = seatNo;
        this.price = price;
        this.journeyDuration = journeyDuration;
    }
    public Ticket(Flight f){
     this.f = f;
    }
    public Ticket(Passenger P){
        this.P = P;
    }

    void cancelTicket(){

    }
}
