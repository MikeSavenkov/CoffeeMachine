package machine;

public class BuyCoffee {

    public void buyEspresso(CoffeeMachineState state) {
        state.setWater(state.getWater() - 250);
        state.setCoffeeBeans(state.getCoffeeBeans() - 16);
        state.setCups(state.getCups() - 1);
        state.setMoney(state.getMoney() + 4);
    }

    public void buyLatte(CoffeeMachineState state) {
        state.setWater(state.getWater() - 350);
        state.setMilk(state.getMilk() - 75);
        state.setCoffeeBeans(state.getCoffeeBeans() - 20);
        state.setCups(state.getCups() - 1);
        state.setMoney(state.getMoney() + 7);
    }

    public void buyCappuccino(CoffeeMachineState state) {
        state.setWater(state.getWater() - 200);
        state.setMilk(state.getMilk() - 100);
        state.setCoffeeBeans(state.getCoffeeBeans() - 12);
        state.setCups(state.getCups() - 1);
        state.setMoney(state.getMoney() + 6);
    }
}
