
package com.mycompany.restaurantapp.foods;
import com.mycompany.restaurantapp.values.DishTypes;
import com.mycompany.restaurantapp.values.DishVariation; 

public class Dish {
    String name; 
    
    DishTypes type; 
    int stock; 
    int price; 
    
    DishVariation variation;   //siempre que escribo algo asì debo importar de dònde viene 

    public Dish(String name, DishTypes type, int stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    }







}
