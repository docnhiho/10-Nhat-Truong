package javaoop.exe4;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private HashMap<Integer, Product> products = new HashMap<>();
    public Order(){
    }
    public void addProduct(Product product){
        products.put(product.getId(),product);
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }
}
