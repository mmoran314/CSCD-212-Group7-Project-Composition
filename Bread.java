public class Bread implements Food{
    private String name;
    private int quantity;
    private double price;
    private int slices;

    public Bread(final String name, final int quantity, final double price, final int slices) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.slices = slices;
    }
    @Override
    public void showFoodDetails() {
        System.out.println(name + ": " + "\n" + "Quantity: " + quantity + "\n" + "Price: " + price + "\n" + "Slices: " + slices);
    }
}


