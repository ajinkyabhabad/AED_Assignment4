/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant {
    HashMap<String, Double> menu; 
    String managername;
    String restaurantname;
    String adresss;
    int contactinfo;
    
    public Restaurant(){
        menu = new HashMap<String, Double>();
        this.managername = managername;
        this.contactinfo = contactinfo;
        this.adresss = this.adresss;
        this.restaurantname = restaurantname;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Double> menu) {
        this.menu = menu;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getAdresss() {
        return adresss;
    }

    public void setAdresss(String adresss) {
        this.adresss = adresss;
    }

    public int getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(int contactinfo) {
        this.contactinfo = contactinfo;
    }
    
    
    
    public HashMap<String, Double> addMenu(String name, Double price){
        menu.put(name, price);
        return menu;
    }
    
    public HashMap<String, Double> moifyMenuItemName(String existingname, String newname){
        for (String nm: menu.keySet()){
            if (nm.equalsIgnoreCase(existingname)){
                
                Double val = menu.get(nm);
                menu.remove(nm);
                menu.put(newname, val);
            }
        }
        return menu;
    }
    
    public HashMap<String, Double> moifyMenuItemPrice(String itemname, Double price){
        for (String nm: menu.keySet()){
            if (nm.equalsIgnoreCase(itemname)){
                
                menu.replace(nm, price);
            }
        }
        return menu;
    }
}
