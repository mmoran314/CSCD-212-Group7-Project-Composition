// This file will be our composite with a list of all our foods
import java.util.*;
public class composition implements Food {
    private ArrayList<Food> myList = new ArrayList<>();

    @Override
    public void showFoodDetails() {
        int i = 0;
        for (Food myFood :
                myList) {
            System.out.print(i + ": ");
            myFood.showFoodDetails();
            i++;
        }
    }
    public void addFood(Food myFood) {
        myList.add(myFood);
    }
    public void removeFood(Food myFood) {
        myList.remove(myFood);
    }
    public Food getFood(int i) {
        return myList.get(i);
    }
}

