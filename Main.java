import java.util.HashMap;
import java.util.map;

public class Main{
    HashMap<String,Integer>price = new HashMap<>();
    price.put("Leonovo",2357);
    price.put("HP",2599);
    price.put("Dell", 2789);

    LaptopPrice laptop = new LaptopPrice("Windows11",price);
    laptop.calculateAverage();
    laptop.listTheBrand();
}
