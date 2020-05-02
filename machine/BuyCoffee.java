package machine;

public class BuyCoffee {

    public void buyEspresso(CoffeeMachineState state) {
        if (state.getWater() > 250 && state.getCoffeeBeans() > 16 && state.getCups() > 0) {
            state.setWater(state.getWater() - 250);
            state.setCoffeeBeans(state.getCoffeeBeans() - 16);
            state.setCups(state.getCups() - 1);
            state.setMoney(state.getMoney() + 4);
            System.out.println("I have enough resources, making you a coffee!\n");
        }

    }

    public void buyLatte(CoffeeMachineState state) {
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

    public void buyCappuccino(CoffeeMachineState state) {
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
