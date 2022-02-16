public class Main {
    public static void main(String args[]) {
        Meat steak = new Meat("Steak", 800, 14.99, false);
        Salad caesarSalad = new Salad("Caesar Salad", 100, 10.99, true);
        Meat chicken = new Meat("Chicken", 400, 11.99, false);
        // Now we will create our full menu
        composition fullMenu = new composition();
        fullMenu.addFood(steak);
        fullMenu.addFood(caesarSalad);
        fullMenu.addFood(chicken);
        // Now we can display our full menu with one method
        System.out.println("Full Menu:");
        fullMenu.showFoodDetails();
        // Let's create our sub menus to filter meats and salads then display it
        composition meatMenu = new composition();
        meatMenu.addFood(steak);
        meatMenu.addFood(chicken);
        System.out.println("Meat Menu: ");
        meatMenu.showFoodDetails();
        // Finally a salad menu
        composition saladMenu = new composition();
        saladMenu.addFood(caesarSalad);
        System.out.println("Salad Menu: ");
        saladMenu.showFoodDetails();
    }
}
