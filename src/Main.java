import com.car.internal.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What function would you like to run?");
        System.out.println("Choices: Transmission, Movement, Steering");

        Scanner scanner = new Scanner(System.in);
        String function = scanner.nextLine();

        if (Objects.equals(function, "Transmission")) {

        }
    }
}
