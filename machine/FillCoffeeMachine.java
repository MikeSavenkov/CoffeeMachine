package machine;

import java.util.Scanner;

public class FillCoffeeMachine {

    public void fill(CoffeeMachineState state) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();

        state.setWater(state.getWater() + water);
        state.setMilk(state.getMilk() + milk);
        state.setCoffeeBeans(state.getCoffeeBeans() + coffeeBeans);
        state.setCups(state.getCups() + cups);

    }
}
