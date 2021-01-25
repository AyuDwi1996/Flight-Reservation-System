package com.company;

public class Main {

    public static void main(String[] args) {
	// + printTicketDetails(ticket: Ticket): void
        TouristTicket t1 = new TouristTicket(112233,"Bang","Nagpur", "9:30", "6:30",
        32,6000,3);
        RegularTicket t2 = new RegularTicket(112234,"Bang","Nagpur", "9:30", "6:30",
                32,6000,3);
        printTicketDetails(t1);
        printTicketDetails(t2);
    }
    public static void printTicketDetails(Ticket ticket){
      System.out.println(ticket.PNR);
    }
}
