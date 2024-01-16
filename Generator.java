public class Generator {
    String[] fruit = new String[] {"Apple", "Orange", "Bananas", "Potato", "Tomato"};
    String[] drink = new String[] {"Water", "Juce", "Ice tia", "Beer"};
    String[] hotDrink = new String[] {"Coffe", "Tia", "Chocolate"};
    String[] sweets = new String[] {"Mars", "Twix", "Bounte", "Chocolate", "Marmalade"};

    Counter counter = new Counter(0);
    Randomizer rand = new Randomizer();

    public Product startGenerateFruit(){
        return new Fruit(counter.assignId(), fruit[rand.getRandomInt(0, fruit.length)], rand.getRandomDouble(1000,1000000), rand.getRandomDate());
    }
    public Product startGenerateDrink(){
        return new Drink(counter.assignId(), drink[rand.getRandomInt(0, drink.length)], rand.getRandomDouble(1000,1000000), rand.getRandomDouble(1000, 10000));
    }
    public Product startGenerateHotDrink(){
        return new HotDrink(counter.assignId(), hotDrink[rand.getRandomInt(0, hotDrink.length)], rand.getRandomDouble(1000,1000000), rand.getRandomDouble(1000, 10000), rand.getRandomDouble(5000, 7000));
    }
    public Product startGenerateSweets(){
        return new Sweets(counter.assignId(), sweets[rand.getRandomInt(0, sweets.length)], rand.getRandomDouble(1000,1000000), rand.getRandomDouble(1000, 10000));
    }
    
}
