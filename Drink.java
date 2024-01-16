public class Drink extends Product{

    protected double volume;

    public Drink(int id, String title, Double price, double volume){
        super(id, title, price);
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }
    
    @Override
    public String toString(){
        return String.format("Id продукта %s, наменование %s, объем %s стоимость %s руб.", this.id, this.title, this.volume, this.price);
    }

}
