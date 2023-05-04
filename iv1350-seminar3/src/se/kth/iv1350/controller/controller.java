package se.kth.iv1350.controller;

import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*; 

public class controller {
    private Sale sale; 
    private ExternalInventory extInv;
    private ExternalAccounting extAcc;
    private Printer printer; 
    
    public controller(ExternalInventory extInv, ExternalAccounting extAcc, Printer printer){
        this.extInv = extInv; 
        this.extAcc = extAcc;
        this.printer = printer; 
    }

    public SaleDTO startSale() {
        this.sale = new Sale();
        return sale.getSaleInfo();
    }

    public SaleDTO registerItem(int itemIdentifier, double quantity){
        Item item = extInv.retrieveItem(itemIdentifier); 
        if (item == null){
            System.out.println("Invalid Item Identifier: " + Integer.toString(itemIdentifier));
        }
        else{
            sale.calculateCost(item, quantity, sale); 
        }
    return sale.getSaleInfo();
    }

    
    public void pay(double paidAmount){
        Payment payment = new Payment(paidAmount, sale.getSaleInfo().getRunningTotal());
        extAcc.updateAccounting(paidAmount);
        extInv.updateInventory(sale);
        Receipt receipt = new Receipt(sale, payment);
        printer.printReceipt(receipt);
    }
}
