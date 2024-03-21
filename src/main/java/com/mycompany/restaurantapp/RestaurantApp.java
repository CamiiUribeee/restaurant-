

package com.mycompany.restaurantapp;

import com.mycompany.restaurantapp.foods.Menu;
import com.mycompany.restaurantapp.people.User; 
import com.mycompany.restaurantapp.values.UserTypes; 
import com.mycompany.restaurantapp.values.DishTypes; 
import com.mycompany.restaurantapp.values.DishVariation; 
import com.mycompany.restaurantapp.foods.Dish; 


public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Camila", "192214");
        student.buy(); 
        student.sell();    // ahí le cambié el orden, primero buy y luego sell 
        User administrative = new User (UserTypes.ADMINISTRATIVE, "María", "1928818281");
        // administrative.sell(); ahí no podría poner ese .sell porque le diría a un administrativo que no está autorizado para vender 
        administrative.SellingAdmin();
        
        
        
        
        //User user = new user (); 
        
        
        Menu menu1 = new Menu (); //menu1-----
        
        Dish dish1 = new Dish("Huevos pericos", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish("Caldo con arepa", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish3 = new Dish("Arroz chino", DishTypes.LUNCH, 20, 2400, DishVariation.OPTION1); 
        Dish dish4 = new Dish ("Hamburguesa", DishTypes.DINNER, 5, 2500, DishVariation.OPTION1);
        
        menu1.addDish(dish1); 
        menu1.addDish(dish2); 
        menu1.addDish(dish3); 
        menu1.addDish(dish4); //menu1-----
        
        
        
    }
    
  
    
    
}
