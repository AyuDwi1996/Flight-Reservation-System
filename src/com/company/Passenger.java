package com.company;

public class Passenger {
    private static int idCounter;
    public Contact C;
    public Address A;
    public Passenger(Address A,Contact C){
        this.A = A;
        this.C = C;
        idCounter = idCounter + 1;
    }

    private static class Address {
        public String street;
        public String city;
        public String state;
        public Address(String street,String city,String state){
            this.city = city;
            this.state = state;
            this.street = street;
        }

    }
    private static class Contact {
        public String email;
        public String phoneNo;
        public Contact(String email,String phoneNo){
            this.email = email;
            this.phoneNo = phoneNo;
        }

    }
    public int getPassengerCount(){
        return (idCounter);
    }

}
