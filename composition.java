// This file will be our composite with a list of all our foods
import java.util.*;
public class composition implements Food {
    private ArrayList<Food> myMenu = new ArrayList<>();

    @Override
    public void showFoodDetails() {
        int i = 0;
        for (Food myFood :
                myMenu) {
            System.out.print(i + ": ");
            myFood.showFoodDetails();
            i++;
        }
    }
    public void addFood(Food myFood) {
        myMenu.add(myFood);
    }
    public void removeFood(Food myFood) {
        myMenu.remove(myFood);
    }
    public Food getFood(int i) {
        return myMenu.get(i);
    }
}

