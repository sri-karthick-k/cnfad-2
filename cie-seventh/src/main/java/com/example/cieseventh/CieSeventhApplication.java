package com.example.cieseventh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CieSeventhApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(CieSeventhApplication.class, args);
		CustomerService cs = ac.getBean(CustomerService.class);
		cs.insert("sri", "xyz");
		List<Customer> cc = cs.display();
		for(Customer c : cc){
			System.out.println(c.toString());
		}
		cs.search(1).toString();
	}

}
