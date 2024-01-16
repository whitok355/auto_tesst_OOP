import java.util.List;

public class Shower {
    
    /**
     * @param arr массив продуктов для вывода в консоль
     */
    public void show(List<Product> arr){
        if(arr == null){
            System.out.println("Список пуст, нечего выводить на экран");
        } else{
            System.out.println("По Вашему запросы найдены следующие элементы:");
            for(Product el : arr){
                System.out.println(el);
            }
        }
    }
}
