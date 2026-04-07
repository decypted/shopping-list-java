package com.pluralsight;
import java.util.List;



public class ShoppingList {
    public static void main(String[] arg) {
        List<String> shoppingList = List.of(
                "Macbook M5 Pro",
                "Toyota Corolla",
                "Honda Civic",
                "Apples",
                "Airbus A380",
                "Milk",
                "Minecraft Java Edition",
                "Caprisun",
                "Boba",
                "Green Tea"
        );
        System.out.println(shoppingList);

        for(int i = 0; i < shoppingList.size(); i++){
            System.out.println("Next item on your shopping list is: " + shoppingList.get(i));

        }
    }
}
