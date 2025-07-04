import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Products, Integer> items = new HashMap<>();
  ;

    void add(Products prod, int quantity) {
        if (prod.getQuantity() == 0) {
            System.out.println("Error Product :" + prod.getName() + " is out of stock now");
        }  else if (prod.getQuantity() > quantity) {
            items.put(prod, quantity);
        }
    }



}
