import java.util.*;
public class Meat implements Food { // The Meat will be one of our leaves
    private String name;
    private int quantity;
    private double price;


    public Meat(final String name, final int quantity , final double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;


    }

    public Meat() {
    }


    @Override
    public void showFoodDetails() {
        System.out.println(name +  "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n");
    }
}
