import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    private List<Product> list = new ArrayList<>();
    private int listSize;

    public HotDrinkVendingMachine(int listSize){
        this.listSize = listSize;
        this.list = initProduct();
    }

    // region Gettters and Setters
    public List<Product> getProducts(){
        return this.list;
    }
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

    public List<Product> filterProducts(Double price, Double temp, Double volume) {
        List<Product> filterList = new ArrayList<>();
        for(Product el: list) {
            if(el instanceof HotDrink){
                if(el.getPrice() < price && ((HotDrink)el).getTemp() < temp && ((HotDrink)el).getVolume() < volume){
                    filterList.add(el);
                }
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
            int random = r.getRandomInt(0, 2);
            if(random == 1){
                this.list.add(generator.startGenerateDrink());
            } else{
                this.list.add(generator.startGenerateHotDrink());   
            }

        }
        return this.list;
    }

}
