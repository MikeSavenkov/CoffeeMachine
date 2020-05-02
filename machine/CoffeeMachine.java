package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        CoffeeMachineState initialState = new CoffeeMachineState();
        StartCoffeeMachine start = new StartCoffeeMachine();
        start.start(initialState);

    }
}
