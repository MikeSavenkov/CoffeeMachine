package machine;

import java.util.Scanner;

public class StartCoffeeMachine {

    BuyCoffee buyCoffee = new BuyCoffee();
    FillCoffeeMachine fill = new FillCoffeeMachine();

    public void start(CoffeeMachineState state) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            CoffeeMachineState.EnumActions action =
                    CoffeeMachineState.EnumActions.valueOf(scanner.nextLine().toUpperCase());
            switch (action) {
                case BUY:
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu:");
                    CoffeeMachineState.KindsOfCoffee coffee =
                            CoffeeMachineState.KindsOfCoffee.findByNumber(scanner.nextLine());
                    switch (coffee) {
                        case ESPRESSO:
                            buyCoffee.buyEspresso(state);
                            break;
                        case LATTE:
                            buyCoffee.buyLatte(state);
                            break;
                        case CAPPUCCINO:
                            buyCoffee.buyCappuccino(state);
                            break;
                        default:
                            break;
                    }
                    break;
                case FILL:
                    fill.fill(state);
                    System.out.println();
                    break;
                case TAKE:
                    System.out.println();
                    takeMoney(state);
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

    void takeMoney(CoffeeMachineState state) {
        System.out.printf("I gave you $%d\n", state.getMoney());
        state.setMoney(0);

    }
}
