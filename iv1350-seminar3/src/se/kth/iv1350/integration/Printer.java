package se.kth.iv1350.integration;

import se.kth.iv1350.model.Receipt;

public class Printer {
    public Printer(){
    }

    public void printReceipt(Receipt receipt){
        System.out.println(receipt.createReceipt()); 
    }
}
