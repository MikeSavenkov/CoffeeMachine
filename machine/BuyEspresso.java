package machine;

import machine.interfaces.BuyCoffee;

public class BuyEspresso implements BuyCoffee {

    @Override
    public void buy(CoffeeMachineState state) {
        if (state.getWater() > 250 && state.getCoffeeBeans() > 16 && state.getCups() > 0) {
            state.setWater(state.getWater() - 250);
            state.setCoffeeBeans(state.getCoffeeBeans() - 16);
            state.setCups(state.getCups() - 1);
            state.setMoney(state.getMoney() + 4);
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }
}
