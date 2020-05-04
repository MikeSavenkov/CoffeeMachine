package machine;

import machine.interfaces.Take;

public class TakeMoney implements Take {

    @Override
    public void takeMoney(CoffeeMachineState state) {
        System.out.printf("I gave you $%d\n", state.getMoney());
        state.setMoney(0);

    }
}
