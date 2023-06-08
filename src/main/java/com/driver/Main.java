package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

        //name is private, When we directly access private member of class by reference variable it gives error.
        //obj.name="Accio";
        //System.out.println(obj.name);
        //java: name has private access in com.driver.RWOnly

        //To access private member we use getter(to get value) and setter(to set value);
        obj.setName("Accio");
        System.out.println(obj.getName());
    }
}