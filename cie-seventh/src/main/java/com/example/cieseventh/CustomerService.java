package com.example.cieseventh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo cr;

    public void insert(String name, String password){
        Customer c = new Customer();
        c.setName(name);
        c.setPassword(password);

        cr.save(c);
    }

    public List<Customer>  display(){
        return cr.findAll();
    }

    public String search(int id){
        String c = cr.findById(id).orElse(null).toString();
        return c;
    }
}
