import java.util.ArrayList;
import java.util.Map;

public class ShippingService implements InterfaceProduct{


    ArrayList<Products> shprod=new ArrayList<>();
    Cart cart=new Cart();
    void  shipping(){
        for (Map.Entry<Products, Integer> entry : cart.items.entrySet()) {
            Products p = entry.getKey();
            int quantity = entry.getValue();
     if (p. getProduct()==ShippleOrNot.shippable){
         shprod.add(p);

     }
 }
    }

    @Override
    public String getName() {

        return shprod.get(0).getName();
    }
    @Override
    public double getWeight() {
       return shprod.get(0).getWeight();
    }
   public void productsShipped(){
        double totalWegit=0;
        for(Products p:shprod){
            totalWegit+=p.getWeight();
            System.out.println(p.getQuantity() +"X "+p.getName()+" "+p.getWeight()+"g");
        }
       System.out.println("Total Package Weight "+totalWegit/1000+"Kg");
   }
public void CheckOut(){
    for(Products p:shprod){
        System.out.println(p.getQuantity() +"X "+p.getName()+" "+p.getPrice()+"g");
    }

}
}
