

package com.mycompany.restaurantapp;

import people.User; 
import values.UserTypes; 


public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Camila", "192214");
        student.buy(); 
        student.sell();    // ahí le cambié el orden, primero buy y luego sell 
        User administrative = new User (UserTypes.ADMINISTRATIVE, "María", "1928818281");
        // administrative.sell(); ahí no podría poner ese .sell porque le diría a un administrativo que no está autorizado para vender 
        administrative.SellingAdmin();
    }
    
  
    
    
}
