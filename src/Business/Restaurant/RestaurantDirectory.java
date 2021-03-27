/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    ArrayList<Restaurant> restaurantDirectory;
    
    
    public RestaurantDirectory(){
        restaurantDirectory = new ArrayList<Restaurant>();
    }
    
    public Restaurant addRestaurant(String name){
        Restaurant r = new Restaurant();
        restaurantDirectory.add(r);
        return r;
    }
    
    public Restaurant searchRestaurant(String name){
        for (Restaurant r: restaurantDirectory){
            if (r.restaurantname.equalsIgnoreCase(name)){
                return r;
            }
        }
        return null;
    }
    
    public void deleteRestaurant(String name){
        for (Restaurant r: restaurantDirectory){
            if (r.restaurantname.equalsIgnoreCase(name)){
                restaurantDirectory.remove(r);
            }
        }
    }
}
