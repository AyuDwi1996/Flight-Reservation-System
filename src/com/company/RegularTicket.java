package com.company;

public class RegularTicket extends Ticket{
    private boolean food;
    private boolean water;
    private boolean snacks;
    public RegularTicket(long PNR,String depLocation,String arrLocation, String DateTimeArrival, String DateTimeDeparture,
                         int seatNo,float price,int journeyDuration){
        super(PNR, depLocation, arrLocation, DateTimeArrival, DateTimeDeparture, seatNo, price, journeyDuration);

    }

    public void setFood(boolean food){
        this.food = food;
    }
    public void setWater(boolean water){
        this.water = water;
    }
    public void setSnacks(boolean snacks){
        this.snacks = snacks;
    }
    public boolean getFood(){
        return (food);
    }
    public boolean getWater(){
        return (water);
    }
    public boolean getSnacks(){
        return (snacks);
    }

    void cancelTicket() {
        super.status = false;
    }
}
