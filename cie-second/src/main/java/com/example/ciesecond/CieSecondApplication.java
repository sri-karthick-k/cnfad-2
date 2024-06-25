package com.example.ciesecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CieSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(CieSecondApplication.class, args);

		ApplicationContext ac = new ClassPathXmlApplicationContext("conf.xml");
		Department d = ac.getBean(Department.class);

		d.setId(1);
		d.setName("MCA");

		System.out.println(d.toString());

	}

}
