package com.example.ciefirst;

public class Customer {
    String name, address;
    Ticket tick;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tick=" + tick +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Ticket getTick() {
        return tick;
    }

    public void setTick(Ticket tick) {
        this.tick = tick;
    }
}
