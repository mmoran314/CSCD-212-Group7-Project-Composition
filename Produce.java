// Produce Leaf
public class Produce implements Food {
    private String name;
    private int quantity;
    private double price;

    public Produce(final String name, final int quantity, final double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public void showFoodDetails() {
        System.out.println(name + ": " + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price);
    }
}
