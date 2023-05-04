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
        // Creates a new Sale object and returns a SaleDTO object representing the current sale state.
        this.sale = new Sale();
        return sale.getSaleInfo();
    }

    public SaleDTO registerItem(int itemIdentifier, double quantity){
        // Retrieves an item from ExternalInventory based on the given itemIdentifier and calculates the cost for the item.
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
        // Creates a Payment object and updates ExternalAccounting with the paid amount.
        Payment payment = new Payment(paidAmount, sale.getSaleInfo().getRunningTotal());
        extAcc.updateAccounting(paidAmount);
        // Updates ExternalInventory with the items that were sold.
        extInv.updateInventory(sale);
        // Creates a Receipt object and sends it to the Printer to be printed.
        Receipt receipt = new Receipt(sale, payment);
        printer.printReceipt(receipt);
    }
}
