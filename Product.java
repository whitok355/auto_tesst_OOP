public abstract class Product {

    protected int id;
    protected String title;
    protected Double price;

    // region Getters and Setters

    public int getId(){
        return this.id;
    }

    public String getTitle (){
        return this.title;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setId(int value){
        this.id = value;
    }

    public void setTitle(String value){
        this.title = value;
    }

    public void setPrice(Double value){
        this.price = value;
    }
    // endregion

    public Product(int id, String title, Double price){
        this.id= id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Id продукта %s, наменование %s, стоимость %s руб.", this.id, this.title, this.price);
    }
}
