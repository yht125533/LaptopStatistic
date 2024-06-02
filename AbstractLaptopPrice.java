import java.util.HashMap;
import java.util.Map;

public abstract class AbstractLaptopPrice implements Price{
    protected String system;
    protected Map<String,Integer> price;

    public AbstractLaptopPrice(String system,Map<String,Integer> price){
        this.brand = system;
        this.price= price;
    }

    abstract public void calculateAverage();
}