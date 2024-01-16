public class Sweets extends Product{

    private Double calories;

    public Sweets(int id, String title, Double price, Double calories){
        super(id, title, price);
        this.calories = calories;
    }

    @Override
    public String toString(){
        return String.format("Id продукта %s, наменование %s, калорийность %s стоимость %s руб.", this.id, this.title, this.calories, this.price);
    }

}
