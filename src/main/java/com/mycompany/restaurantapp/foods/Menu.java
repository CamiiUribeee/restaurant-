
package com.mycompany.restaurantapp.foods;

import java.util.ArrayList;


public class Menu {   //aqui voy a hacer un array con los objetos que hay en la clase dish, la cual està en el mismo paquete donde esta el menu 
    private ArrayList<Dish> dishList; 
    
    public Menu(){
        this.dishList = new ArrayList<>(); //AQUI SE MARCARIA ERROR SI NO IMPORTAS EL ARRAYLIST 
    }
    
    public void addDish(Dish dish){
        this.dishList.add(dish);  
    }
    
    
    
    
    
    
}
