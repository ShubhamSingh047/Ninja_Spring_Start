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
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "income";
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
        if(taxableAmount <= 300000){
            taxAmount = 0;
        } else if (taxableAmount <= 600000) {
            taxAmount = 0.05 * taxableAmount;
        } else if (taxableAmount <= 900000) {
            taxAmount = 0.1 * taxableAmount;
        } else if (taxableAmount <= 1200000) {
            taxAmount = 0.15 * taxableAmount;
        } else if (taxableAmount <= 1500000) {
            taxAmount = 0.2 * taxableAmount;
        }
        else{
            taxAmount = 0.3 * taxableAmount;
        }
    }
}
