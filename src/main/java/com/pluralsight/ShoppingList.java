package com.pluralsight;
import java.util.List;



public class ShoppingList {
    public static void main(String[] arg) {
        List<String> shoppingList = List.of(
                "Macbook M5 Pro",
                "Toyota Corolla",
                "Honda Civic",
                "Airbus B747",
                "Airbus A380",
                "Milk",
                "Minecraft Java Edition",
                "Caprisun",
                "Boba",
                "Green Tea"
        );
        System.out.println("All items in your shopping list: " + shoppingList);
        System.out.println(shoppingList.size());
//        Intended way of doing the list:
        System.out.println("=======SHOPPING LIST VIA PRINTIN======");
        System.out.println("Oranges");
        System.out.println("Grapes");
        System.out.println("Celsius Energy Drink");
        System.out.println("Monster");
        System.out.println("Coffee");
        System.out.println("Beans");
        System.out.println("Bacon eggs & cheese");
        System.out.println("Lays chips");
        System.out.println("Rufus");
        System.out.println("Snapple");
        System.out.println("=======END OF LIST VIA PRINTIN======");
        for(int i = 0; i < shoppingList.size(); i++){
            System.out.println("Next item on your shopping list is: " + shoppingList.get(i));

        }
    }
}
