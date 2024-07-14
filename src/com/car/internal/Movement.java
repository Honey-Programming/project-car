package com.car.internal;

import java.util.Objects;
import java.util.Scanner;

public class Movement {
    int speed = 0;
    String state = Transmission.mode;
    int maxSpeed = Transmission.gear * 10;

    public void callFunction() {
        System.out.println("Choose a function: gas, brake");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Objects.equals(input, "gas")) {
            gas();
        } else if (Objects.equals(input, "brake")) {
            brake();
        }
    }

    public void gas() {
        if (Objects.equals(state, "D") || Objects.equals(state, "R")) {
            if (speed < maxSpeed) {
                speed += 10;
                System.out.println(speed);
            } else if (speed >= maxSpeed) {
                System.out.println("You have reached the maximum speed for this gear. Please shift up or reduce speed");
            }
        } else {
            System.out.println("You need to be in gear D or R to use this function.");
        }
    }

    public void brake() {
        if (Objects.equals(state, "D") || Objects.equals(state, "R")) {
            speed -= 10;
            System.out.println(speed);
        }
    }
}
