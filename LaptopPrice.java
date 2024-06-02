import java.util.map;

public class LaptopPrice extends AbstractLaptopPrice{
    public LaptopPrice(String brand,Map<String,Integer>price){
        super(system,price);
    }

    @Override
    public void calculateAverage(){
        int total = 0;
        for (int price : price.values()){
            total += price;
        }
        double average = (double)total/price.size();
        System.out.println("The Average price of this system is" +total);
    }

    public void listTheBrand(){
        System.out.println("the system:" +system);
        for(Map.Entry<String,Integer> Entry : price.entrySet()){
            System.out.println("Brand: " +price.getKey()+ " price: "+price.getValue());
        }
    }
}