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
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu:");
                    String coffee = scanner.nextLine();
                    switch (coffee) {
                        case "1":
                            buyCoffee.buyEspresso(state);
                            break;
                        case "2":
                            buyCoffee.buyLatte(state);
                            break;
                        case "3":
                            buyCoffee.buyCappuccino(state);
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    fill.fill(state);
                    System.out.println();
                    break;
                case "take":
                    System.out.println();
                    takeMoney(state);
                    break;
                case "remaining":
                    System.out.println();
                    state.printState();
                    break;
                case "exit":
                    flag = false;
            }
        }
    }

    void takeMoney(CoffeeMachineState state) {
        System.out.printf("I gave you $%d\n", state.getMoney());
        state.setMoney(0);

    }



}
