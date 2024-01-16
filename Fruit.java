public class Fruit extends Product {
    
    private String expDate;

    public Fruit(int id, String title, Double price, String expDate){
        super(id, title, price);
        this.expDate = expDate;
    }

    public String getExpDate(){
        return this.expDate;
    } 

    @Override
    public String toString(){
        return String.format("Id продукта %s, наменование %s, стоимость %s руб., срок годности %s", this.id, this.title, this.price, this.expDate);
    }
}
