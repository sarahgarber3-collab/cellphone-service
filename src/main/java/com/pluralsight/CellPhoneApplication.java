package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone iphone = new CellPhone(321,"IphonePro","Verizon","(678)-322-1234","Lilith Macelhanon");

        System.out.println(iphone.getSerialNumber());
        System.out.println(iphone.getModel());
        System.out.println(iphone.getCarrier());
        System.out.println(iphone.getPhoneNumber());
        System.out.println(iphone.getOwner());

    }
}