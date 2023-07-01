package javaoop.exe4;

import javaoop.exe4.Customer;
import javaoop.exe4.Product;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Product candy = new Product(1,"Candy",3000d,100);
        Product candy2 = new Product(2,"Candy2",5000d,100);
        Product candy3 = new Product(3,"Candy3",7000d,100);
        Product candy4 = new Product(4,"Candy4",9000d,100);
        Customer customer = new Customer("Nhat","09090");
        Customer customer1 = new Customer("Minh","1234");
        customer.order(List.of(candy,candy2,candy3,candy4));
        customer.order(List.of(candy,candy2));
        customer.order(List.of(candy4));
        customer1.order(List.of(candy));
        customer.showCart();
        customer1.showCart();
    }
}
