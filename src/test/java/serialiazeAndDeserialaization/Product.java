package serialiazeAndDeserialaization;

import org.apache.juneau.annotation.Beanc;

import java.util.Arrays;

public class Product {

    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", sellerName=" + Arrays.toString(sellerName) +
                '}';
    }

    private int price;
    private String color;

    private String[] sellerName;
@Beanc(properties = "name, price, color, sellerName")
    public Product(String name,int price,String color,String[] sellerName)
    {
        this.name = name;
        this.price = price;
        this.color = color;
        this.sellerName = sellerName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getSellerName() {
        return sellerName;
    }

    public void setSellerName(String[] sellerName) {
        this.sellerName = sellerName;
    }

}
