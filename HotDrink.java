public class HotDrink extends Drink{

    protected Double temp;

    public HotDrink(int id, String title, Double price, double volume, double temp) {
        super(id, title, price, volume);
        this.temp = temp;
    }

    public Double getTemp(){
        return this.temp;
    }
    
    @Override
    public String toString() {
        return String.format("Id продукта %s, наменование %s, объем %s, температура напитка %s *C, стоимость %s руб.", this.id, this.title, this.volume, this.temp, this.price);
    }
    
}
