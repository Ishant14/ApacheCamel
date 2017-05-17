package com.apachecamel.ApacheCamel.service;

import com.apachecamel.ApacheCamel.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by igaurav on 5/16/2017.
 */
//@Component
public class SimpleListener {

    private final StoreService storeService;

    @Autowired
    public SimpleListener(StoreService storeService){
        this.storeService=storeService;
    }

    @JmsListener(destination = "simple.queue")
    public void recieveOrder(Order order){
        storeService.registerOrder(order);
    }

}
