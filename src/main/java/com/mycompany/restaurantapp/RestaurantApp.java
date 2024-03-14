

package com.mycompany.restaurantapp;

import people.User; 
import values.UserTypes; 

public class RestaurantApp {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Fulanito", "2328");
        student.sell();
    }
}
