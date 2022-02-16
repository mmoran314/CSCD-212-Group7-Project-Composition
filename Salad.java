public class Salad implements Food { // This will be our second leaf
    private String name;
    private int quantity;
    private double price;
    private int calories;

    public Salad(final String name, final int quantity, final double price, final int calories) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.calories = calories;
    }

    public Salad() {
    }


    @Override
    public void showFoodDetails() {
        System.out.println(name +  "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" + calories);

    }
}
