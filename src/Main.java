import com.car.internal.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What function would you like to run?");
        System.out.println("Choices: Transmission, Movement, Steering");

        Scanner scanner = new Scanner(System.in);
        String function = scanner.nextLine();

        switch(function) {
            case "Transmission":
                Transmission transmission = new Transmission();
                transmission.callFunction();
                break;
            case "Movement":
                Movement movement = new Movement();
                movement.callFunction();
        }
    }
}
