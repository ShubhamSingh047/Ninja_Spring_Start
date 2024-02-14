package com.example.SpringNinja.basics;

public class Longtable implements Table {
    double height;
    double length;

    public Longtable(){
        height=400.5;
        length=300.3;
    }

    @Override
    public String showDetails() {
        return "table has length "+length+" and height "+height;
    }
}
