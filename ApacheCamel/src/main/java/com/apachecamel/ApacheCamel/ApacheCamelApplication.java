package com.apachecamel.ApacheCamel;

import com.apachecamel.ApacheCamel.model.Order;
import com.apachecamel.ApacheCamel.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApacheCamelApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ApacheCamelApplication.class, args);

		/*System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES","com.apachecamel.ApacheCamel.model");
		Order order = new Order("First Order");
		ClientService clientService = ctx.getBean(ClientService.class);
		clientService.addOrder(order);*/

	}
}
