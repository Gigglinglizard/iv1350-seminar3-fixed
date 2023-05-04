package se.kth.iv1350.model;

import java.time.*;
import java.util.*;
import se.kth.iv1350.integration.*;

public class Sale {
    private LocalDateTime dateAndTime;  
    private List<Item> items;
    private SaleDTO saleInfo;
    private double runningTotal; 
    private double addedVAT; 
    
    public Sale(){
        this.dateAndTime = LocalDateTime.now();
        this.items = new ArrayList<>(); 
        this.saleInfo = new SaleDTO(dateAndTime, 0.0, 0.0, null);   
    }

    public SaleDTO getSaleInfo(){
        return this.saleInfo;
    }

    public void addItem(Item item){
        items.add(item);
        this.saleInfo = new SaleDTO(this.dateAndTime, this.runningTotal, this.addedVAT, this.items); 
    }

    public void calculateCost(Item item, double quantity, Sale sale){
        isSameItem(item, quantity);
        addVAT(item.getItemDescription().getVAT(), quantity, item.getItemDescription().getPrice());
        updateRunningTotal(item.getItemDescription().getPrice(), quantity, item.getItemDescription().getVAT());
    }

    private void addVAT(double VAT, double quantity, double price){  
        this.addedVAT += (VAT*price)*quantity;
        this.saleInfo = new SaleDTO(this.dateAndTime, this.runningTotal, this.addedVAT, this.items); 
    }

    private void updateRunningTotal(double price, double quantity, double VAT){
        this.runningTotal += (price + (price * VAT)) * quantity;
        this.saleInfo = new SaleDTO(this.dateAndTime, this.runningTotal, this.addedVAT, this.items); 
    }

    private void isSameItem(Item item, double quantity) {
        boolean correctItem = false;
        for (Item duplicate : items) {
            if (duplicate.getItemDescription().equals(item.getItemDescription())) {
                correctItem = true;
                item.setQuantity(duplicate.getQuantity() + quantity);
                break;
            }
        }
        if (!correctItem) {
            items.add(item);
            item.setQuantity(item.getQuantity() + quantity); 
        }
    }

    public List<Item> getItems() {
        return items;
    }
}
