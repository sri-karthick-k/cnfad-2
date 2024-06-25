package com.example.ciefirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CieFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(CieFirstApplication.class, args);

		ApplicationContext ac = new ClassPathXmlApplicationContext("conf.xml");

		Customer c = ac.getBean(Customer.class);
		Ticket t = c.getTick();

		c.setName("Sri");
		c.setAddress("Bpet");
		t.setId(1);
		t.setPrice(500);
		t.setType("gold");
		t.setSeatNo(101);

		System.out.println(c.toString());
	}

}
