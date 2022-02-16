import java.util.*;
public class Meat implements Food { // The Meat will be our first leaf
    private String name;
    private int calories;
    private double price;
    private boolean vegetarian;

    public Meat(final String name, final int calories,final double price, final boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.vegetarian = vegetarian;

    }

    public Meat() {
    }


    @Override
    public void showFoodDetails() {
        if (vegetarian) {
            System.out.println(name +  "\n" + "Calories: " + calories + "\n" + "Price: " + price + "\n" + "Vegetarian" + "\n");
        }
        else {
            System.out.println(name +  "\n" + "Calories: " + calories + "\n" + "Price: " + price + "\n");
        }
    }
}
