/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author ajink
 */
public class Order {
    
    int orderId;
    String orderStatus;
    ArrayList<String> menuList;
    //String OrderDateTime;

    public Order(int orderId, String orderStatus, ArrayList<String> menuList) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.menuList = menuList;
    }
    
    
    
    
    
}
