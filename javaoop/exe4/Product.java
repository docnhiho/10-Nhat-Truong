package javaoop.exe4;

public class Product {
    private Integer id;

    public String name;
    public double price;
    public int quality;

    public Product(int id ,String name, double price, int quality) {
        this.id =id;
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
