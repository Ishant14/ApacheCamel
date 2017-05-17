package com.apachecamel.ApacheCamel.service;

import com.apachecamel.ApacheCamel.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by igaurav on 5/15/2017.
 */
//@Service
public class ClientServiceImpl implements ClientService {

    private static final String SIMPLE_QUEUE="simple.queue";

    private final JmsTemplate jmsTemplate;

    @Autowired
    public ClientServiceImpl(JmsTemplate jmsTemplate){
        this.jmsTemplate=jmsTemplate;
    }

    @Override
    public void addOrder(Order order) {
        jmsTemplate.convertAndSend(SIMPLE_QUEUE,order);
    }

}
