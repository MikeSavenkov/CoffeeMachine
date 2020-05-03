package machine;

public class CoffeeMachineState {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public CoffeeMachineState() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
    }

    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                "$" + money + " of money\n";
    }
    public void printState() {
        System.out.println(this.toString());
    }

    enum EnumActions {

        BUY, FILL, TAKE, REMAINING, EXIT
    }

    enum KindsOfCoffee {
        ESPRESSO("1"), LATTE("2"), CAPPUCCINO("3"), BACK("4");

        private final String numberOfCoffee;

        KindsOfCoffee(String numberOfCoffee) {
            this.numberOfCoffee = numberOfCoffee;
        }

        public static KindsOfCoffee findByNumber(String numberOfCoffee) {
            for (KindsOfCoffee coffee : values()) {
                if (coffee.numberOfCoffee.equals(numberOfCoffee)) {
                    return coffee;
                }
            }
            return BACK;
        }
    }

}
