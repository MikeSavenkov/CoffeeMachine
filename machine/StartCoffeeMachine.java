package machine;

import java.util.Scanner;

public class StartCoffeeMachine {


    public void start(CoffeeMachineState state) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            CoffeeMachineState.EnumActions action =
                    CoffeeMachineState.EnumActions.valueOf(scanner.nextLine().toUpperCase());
            switch (action) {
                case BUY:
                    chooseCoffee(state);
                    break;
                case FILL:
                    new FillCoffeeMachine().fill(state); // FillCoffeeMachine fill = fill(state);
                    System.out.println();
                    break;
                case TAKE:
                    System.out.println();
                    new TakeMoney().takeMoney(state);
                    break;
                case REMAINING:
                    System.out.println();
                    state.printState();
                    break;
                case EXIT:
                    flag = false;
            }
        }
    }



    void chooseCoffee(CoffeeMachineState state) {

        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:");
        CoffeeMachineState.KindsOfCoffee coffee = CoffeeMachineState.KindsOfCoffee.
                findByNumber(new Scanner(System.in).nextLine());

        switch (coffee) {
            case ESPRESSO:
                new BuyEspresso().buy(state);
                break;
            case LATTE:
                new BuyLatte().buy(state);
                break;
            case CAPPUCCINO:
                new BuyCappuccino().buy(state);
                break;
            default:
                break;
        }
    }
}
