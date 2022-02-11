public class Meat implements Food { // The Meat will be our first leaf
    private String name;
    public int calories;
    public boolean vegetarian;

    public Meat(String name, int calories, boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
    }


    @Override
    public void showFoodDetails() {
        if (vegetarian) {
            System.out.println(name + " - " + "\n" + "Calories: " + calories + "\n" + "Vegetarian");
        }
        else {
            System.out.println(name + " - " + "\n" + "Calories: " + calories);
        }
    }
}
