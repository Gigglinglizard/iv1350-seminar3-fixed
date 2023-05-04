package se.kth.iv1350.integration;

public class ItemDescription {
    private String name; 
    private double price;
    private double VAT;
    
    public ItemDescription(String name, double price, double VAT) {
        this.name = name;
        this.price = price;
        this.VAT = VAT;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getVAT() {
        return this.VAT;
    }
}
