package javaoop.exe4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    public String name;
    public String phone;
    public Map<Integer, Order> listOrder = new HashMap();
    public Integer orderId = 1;
    public Customer() {
    }
    public Customer(String name, String phone, Map<Integer, Order> listOrder, Integer orderId) {
        this.name = name;
        this.phone = phone;
        this.listOrder = listOrder;
        this.orderId = orderId;
    }

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Map<Integer, Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(Map<Integer, Order> listOrder) {
        this.listOrder = listOrder;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void order(List<Product> product) {
        Order newOrder = new Order();
        product.forEach(newOrder::addProduct);
        listOrder.put(orderId++, newOrder); //id order tu tang
    }

    public void showCart() {
        listOrder.forEach((k, value) -> {
            System.out.println("Order: " + k);
            value.getProducts().forEach((key, val) -> {
                System.out.println("ProductId: " + key);
                System.out.println("ProductName: " + val.getName());
                System.out.println("ProductPrice: " + val.getPrice());
                System.out.println("ProductQuantity: " + val.getQuality());
                System.out.println();
            });
            System.out.println("**************************************************");
            System.out.println();
        });
    }
}
