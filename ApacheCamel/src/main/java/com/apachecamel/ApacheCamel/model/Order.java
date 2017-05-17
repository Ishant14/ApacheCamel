package com.apachecamel.ApacheCamel.model;

import java.io.Serializable;

/**
 * Created by igaurav on 5/15/2017.
 */
public class Order implements Serializable{

    private final String id;

    public Order(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
