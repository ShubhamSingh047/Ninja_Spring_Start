package com.example.SpringNinja.basics;

public class ShortTable implements Table{

    double height;
    double length;

    public  ShortTable(){
        this.height=40;
        this.length=30.2;
    }
    @Override
    public String showDetails() {
        return "table has length "+length+" and height "+height;
    }
}
