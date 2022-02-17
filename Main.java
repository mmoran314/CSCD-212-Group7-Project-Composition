import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Some foods to add to our grocery list
        Meat steak = new Meat("Steak", 1, 6.99);
        Meat chicken = new Meat("Chicken", 2, 5.99);
        Produce banana = new Produce("Banana", 5, 0.20);
        Produce apple = new Produce("Apple", 4, 0.59);
        Bread wholeWheat = new Bread("Whole Wheat", 1, 2.99, 12);
        Bread multiGrain = new Bread("Multi Grain", 2, 3.99, 14);


        // Let's create a subList for our meats
        composition meatList = new composition();
        meatList.addFood(steak);
        meatList.addFood(chicken);

        // Produce List
        composition produceList = new composition();
        produceList.addFood(banana);
        produceList.addFood(apple);

        //Bread List
        composition breadList = new composition();
        breadList.addFood(wholeWheat);
        breadList.addFood(multiGrain);

        // Let's add all our lists into one big grocery List
        composition fullList = new composition();
        fullList.addFood(meatList);
        fullList.addFood(produceList);
        fullList.addFood(breadList);


        System.out.println("Please pick one of the options: ");
        System.out.println("1. Display Full Grocery List");
        System.out.println("2. Display Meat List");
        System.out.println("3. Display Produce List");
        System.out.println("4. Display Bread List");
        int choice = input.nextInt();
        switch (choice) {
            case(1):{
                System.out.println("Full Grocery List:");
                fullList.showFoodDetails();
                break;
            }
            case(2):{
                System.out.println("Meat List: ");
                meatList.showFoodDetails();
                break;
            }
            case(3):{
                System.out.println("Produce List: ");
                produceList.showFoodDetails();
                break;
            }
            case(4): {
                System.out.println("Bread List: ");
                breadList.showFoodDetails();
                break;
            }
        }
    }
}
