package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("What is the serial number? ");
        cellPhone.setSerialNumber(scan.nextInt());
        scan.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone.setModel(scan.nextLine());

        System.out.print("What carrier is the phone? ");
        cellPhone.setCarrier(scan.nextLine());

        System.out.print("Whats your phone number? ");
        cellPhone.setPhoneNumber(scan.nextLine());

        System.out.print("Whats your name? ");
        cellPhone.setOwner(scan.nextLine());


        System.out.println("Serial number: " + cellPhone.getSerialNumber());
        System.out.println("Phone model: " + cellPhone.getModel());
        System.out.println("Phone carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner of phone: " + cellPhone.getOwner());


    }
}