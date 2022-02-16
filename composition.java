// This file will be our composite with a list of all our foods
import java.util.*;
public class composition implements Food {
    private ArrayList<Food> myMenu = new ArrayList<>();

    @Override
    public void showFoodDetails() {
        for (Food myFood :
                myMenu) {
            myFood.showFoodDetails();
        }
    }
    public void addFood(Food myFood) {
        myMenu.add(myFood);
    }
    public void removeFood(Food myFood) {
        myMenu.remove(myFood);
    }
}

