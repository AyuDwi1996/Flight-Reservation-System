package com.company;

public class TouristTicket extends Ticket{


    public TouristTicket(long PNR,String depLocation,String arrLocation, String DateTimeArrival, String DateTimeDeparture,
                         int seatNo,float price,int journeyDuration){
        super(PNR, depLocation, arrLocation, DateTimeArrival, DateTimeDeparture, seatNo, price, journeyDuration);

    }
    public String[] touristLocation = new String[5];
    public void setLocation(String location[]){
        int len = location.length;
        for(int i=0;i<len;i++){
        touristLocation[i]= location[i];}
    }


    void cancelTicket() {
        super.status = false;
    }
}
