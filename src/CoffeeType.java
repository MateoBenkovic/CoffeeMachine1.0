public class CoffeeType {

    private final int waterNeeded;
    private final int milkNeeded;
    private final int coffeeBeansNeeded;
    private final int price;

    public CoffeeType(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int price) {
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.coffeeBeansNeeded = coffeeBeansNeeded;
        this.price = price;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public int getCoffeeBeansNeeded() {
        return coffeeBeansNeeded;
    }

    public int getPrice() {
        return price;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }
}
