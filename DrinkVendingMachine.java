import java.util.ArrayList;
import java.util.List;

public class DrinkVendingMachine implements VendingMachine{

    private List<Product> list = new ArrayList<>();
    private int listSize;

    public DrinkVendingMachine(int listSize){
        this.listSize = listSize;
        this.list = initProduct();
    }

    // region Gettters and Setters
    public List<Product> getProducts(){
        return this.list;
    }
    //endregion
    @Override
    public List<Product> filterProducts(Double price) {
        List<Product> filterList = new ArrayList<>();
        for(Product el: list) {
            if(el.getPrice() < price){
                filterList.add(el);
            }
        }

        if(filterList.size() == 0){
            return null;
        } else {
            return filterList;
        }
    }
    public List<Product> filterProducts(Double price, Double volume) {
        List<Product> filterList = new ArrayList<>();
        for(Product el: list) {
            if(el.getPrice() < price && ((Drink)el).getTitle().equals(volume)){
                filterList.add(el);
            }
        }

        if(filterList.size() == 0){
            return null;
        } else {
            return filterList;
        }
    }

    @Override
    public List<Product> initProduct() {
        Generator generator = new Generator();
        Randomizer r = new Randomizer();
        for(int count = 0; count < this.listSize; count++){
            int random = r.getRandomInt(0, 1);
            if(random == 1){
                this.list.add(generator.startGenerateDrink());
            } else{
                this.list.add(generator.startGenerateHotDrink());   
            }

        }
        return this.list;
    }

    
}
