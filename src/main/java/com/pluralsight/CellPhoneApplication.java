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
        String model = scan.nextLine();

        System.out.print("What carrier is the phone? ");
        String carrier = scan.nextLine();

        System.out.print("Whats your phone number? ");
        String phoneNumber = scan.nextLine();

        System.out.print("Whats your name? ");
        String owner = scan.nextLine();



    }
}