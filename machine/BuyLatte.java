package machine;

import machine.interfaces.BuyCoffee;

public class BuyLatte implements BuyCoffee {

    @Override
    public void buy(CoffeeMachineState state) {
        if (state.getWater() > 350 && state.getMilk() > 75 && state.getCoffeeBeans() > 20 && state.getCups() > 0) {
            state.setWater(state.getWater() - 350);
            state.setMilk(state.getMilk() - 75);
            state.setCoffeeBeans(state.getCoffeeBeans() - 20);
            state.setCups(state.getCups() - 1);
            state.setMoney(state.getMoney() + 7);
            System.out.println("I have enough resources, making you a coffee!\n");
        } else {
            System.out.println("Sorry, not enough water!\n");

        }
    }
}
