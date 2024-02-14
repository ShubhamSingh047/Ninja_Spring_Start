package com.example.tax;

import java.lang.invoke.LambdaMetafactory;

public class IncomeTax implements Tax {
    /*
    1. Create the following attributes.
        a. taxableAmount (double)
        b. taxAmount (double)
        c. isTaxPayed (boolean)
    2. Make this class an implementation of Tax interface and override the interface methods.
    3. Using constructor initialize the isTaxPayed boolean false.
     */

    double taxableAmount;
    double taxAmount;
    boolean isTaxPayed;

    public IncomeTax(){
        isTaxPayed=false;
    }

    @Override
    public void setTaxableAmount(int amount) {
      taxableAmount=amount;
    }

    @Override
    public double getTaxAmount() {
        return taxableAmount;
    }

    @Override
    public String getTaxType() {
        return "Income";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        isTaxPayed=true;
        System.out.println("Tax paid Sucesssfully !");
    }

    @Override
    public void calculateTaxAmount() {
        if(taxableAmount<=3){
            taxAmount=taxableAmount*0;
        }else if(taxableAmount>3 && taxableAmount<=6){
            taxAmount=taxableAmount*0.05;
        }else if(taxableAmount>6 && taxableAmount<=9){
            taxAmount=taxableAmount*0.1;
        }else if(taxableAmount>9 && taxableAmount<=12){
            taxAmount=taxableAmount*0.15;
        }else if(taxableAmount>12 && taxableAmount<=15){
            taxAmount=taxableAmount*0.2;
        }else{
            taxAmount=taxableAmount*0.3;
        }
    }
}
