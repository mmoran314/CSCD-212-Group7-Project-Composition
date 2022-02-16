public class Salad implements Food { // This will be our second leaf
    private String name;
    private int calories;
    private double price;
    private boolean vegetarian;

    public Salad(final String name, final int calories, final double price, final boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public Salad() {
    }

    @Override
    public void showFoodDetails() {
        if (vegetarian) {
            System.out.println(name +  "\n" + "Calories: " + calories + "\n" + "Price: " + price + "\n"+ "Vegetarian" + "\n");
        } else {
            System.out.println(name +  "\n" + "Calories: " + calories + "\n" + "Price: " + price + "\n");
        }
    }
}
