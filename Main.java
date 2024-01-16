/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Randomizer r = new Randomizer();

        Shower shower = new Shower();

        // DrinkVendingMachine drinkVendingMachine = new DrinkVendingMachine(r.getRandomInt(10, 100));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(r.getRandomInt(2, 10));
        HotDrinkVendingMachine hotDrinkVendingMachine2 = new HotDrinkVendingMachine(r.getRandomInt(2, 9));
        // FruitVendingMachine fruitVendingMachine = new FruitVendingMachine(r.getRandomInt(10, 100));

        // SweetsVendingMachine sweetsVendingMachine = new SweetsVendingMachine(r.getRandomInt(10, 100));

        shower.show(hotDrinkVendingMachine.filterProducts(5000.00, 60.00, 500.00));
        shower.show(hotDrinkVendingMachine2.filterProducts(5000.00, 60.00, 500.00));
        // shower.show(fruitVendingMachine.getProducts());
        // shower.show(sweetsVendingMachine.getProducts());
    }
}