package machine;

import java.util.Scanner;

public class StartCoffeeMachine {

    BuyCoffee buyCoffee = new BuyCoffee();
    FillCoffeeMachine fill = new FillCoffeeMachine();

    public void start(CoffeeMachineState state) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();


        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffee = scanner.nextInt();
                switch (coffee) {
                    case 1:
                        buyCoffee.buyEspresso(state);
                        state.printState();
                        break;
                    case 2:
                        buyCoffee.buyLatte(state);
                        state.printState();
                        break;
                    case 3:
                        buyCoffee.buyCappuccino(state);
                        state.printState();
                        break;
                }
                break;
            case "fill":
                fill.fill(state);
                break;
            case "take":
                takeMoney(state);
                break;
        }
    }

    void takeMoney(CoffeeMachineState state) {
        System.out.printf("I gave you $%d\n", state.getMoney());
        state.setMoney(0);
        state.printState();
    }



}
