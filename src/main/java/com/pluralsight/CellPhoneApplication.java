package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CellPhone cellphone = new CellPhone();

        System.out.print("What is the serial number? ");
        cellphone.setSerialNumber(scan.nextInt());
        scan.nextLine();

        System.out.print("What model is the phone? ");
        cellphone.setModel(scan.nextLine());

        System.out.print("What carrier is the phone? ");
        cellphone.setCarrier(scan.nextLine());

        System.out.print("Whats your phone number? ");
        cellphone.setPhoneNumber(scan.nextLine());

        System.out.print("Whats your name? ");
        cellphone.setOwner(scan.nextLine());

        System.out.println("Serial number: " + cellphone.getSerialNumber());
        System.out.println("Phone model: " + cellphone.getModel());
        System.out.println("Phone carrier: " + cellphone.getCarrier());
        System.out.println("Phone number: " + cellphone.getPhoneNumber());
        System.out.println("Owner of phone: " + cellphone.getOwner());




    }
}