package machine;

import machine.interfaces.BuyCoffee;

public class BuyCappuccino implements BuyCoffee {

    @Override
    public void buy(CoffeeMachineState state) {
        if (state.getWater() > 200 && state.getMilk() > 100 && state.getCoffeeBeans() > 12 && state.getCups() > 0) {
            state.setWater(state.getWater() - 200);
            state.setMilk(state.getMilk() - 100);
            state.setCoffeeBeans(state.getCoffeeBeans() - 12);
            state.setCups(state.getCups() - 1);
            state.setMoney(state.getMoney() + 6);
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }
}
