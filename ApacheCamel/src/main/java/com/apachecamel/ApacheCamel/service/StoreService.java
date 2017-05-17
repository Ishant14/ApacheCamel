package com.apachecamel.ApacheCamel.service;

import com.apachecamel.ApacheCamel.model.Order;

import java.util.List;

/**
 * Created by igaurav on 5/16/2017.
 */
public interface StoreService {

    void registerOrder(Order order);
    Order getRecievedOrder(String id);

}
