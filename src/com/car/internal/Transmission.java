package com.car.internal;

import java.util.Objects;
import java.util.Scanner;

public class Transmission {
    int gear = 1;
    public static String mode = "P";

    public void callFunction() {
        System.out.println("Choose a function.");
        System.out.println("Here are your Options:");
        System.out.println("chooseShift, chooseDriveMode");

        Scanner scanner = new Scanner(System.in);
    }

    public void chooseShift() {
        System.out.println("Would you like to shift up or down?");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Objects.equals(input, "up")) {
            shiftUp();
        } else if (Objects.equals(input, "down")) {
            shiftDown();
        } else {
            System.out.println("Not a valid option.");
        }
    }

    public void shiftUp() {
        gear++;
    }

    public void shiftDown() {
        gear--;
    }

    public void chooseDriveMode() {
        System.out.println("Would you like to shift into (P, N, D, R)?");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input) {
            case "P":
                System.out.println("You have shifted into gear [Park].");
                break;
            case "N":
                System.out.println("You have shifted into gear [Neutral].");
                break;
            case "D":
                System.out.println("You have shifted into gear [Drive].");
                break;
            case "R":
                System.out.println("You have shifted into gear [Reverse].");
            default:
                System.out.println("Not a valid option.");
        }
    }
}