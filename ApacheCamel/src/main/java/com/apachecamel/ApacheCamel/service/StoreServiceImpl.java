package com.apachecamel.ApacheCamel.service;

import com.apachecamel.ApacheCamel.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igaurav on 5/16/2017.
 */
//@Service
public class StoreServiceImpl implements StoreService {

   private final List<Order> recievedOrders = new ArrayList<>();

    @Override
    public void registerOrder(Order order) {
        this.recievedOrders.add(order);
    }

    @Override
    public Order getRecievedOrder(String id) {
        for(Order order: recievedOrders){
            if(id.equals(order.getId())){
                return order;
            }
        }
        return null;
    }

}
