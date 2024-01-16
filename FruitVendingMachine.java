import java.util.ArrayList;
import java.util.List;

public class FruitVendingMachine implements VendingMachine{

    private List<Product> list = new ArrayList<>();
    private int listSize;

    public FruitVendingMachine(int listSize){
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

    @Override
    public List<Product> initProduct() {
        Generator generator = new Generator();
    
        for(int count = 0; count < this.listSize; count++){
            this.list.add(generator.startGenerateFruit());
        }
        return this.list;
    }

}
