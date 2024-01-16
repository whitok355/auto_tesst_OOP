import java.util.List;

public interface VendingMachine {

    List<Product> filterProducts(Double price);
    List<Product> initProduct();
    
}
