package se.kth.iv1350.integration;

// These private variables will hold the name, price, and VAT of an item
public class ItemDescription {
    private String name; 
    private double price;
    private double VAT;
    

     // This is the constructor method for the ItemDescription class.
    // It takes in a name, price, and VAT and sets them to the 
    public ItemDescription(String name, double price, double VAT) {
        this.name = name;
        this.price = price;
        this.VAT = VAT;
    }

    // This method returns the name of the item.
    public String getName() {
        return this.name;
    }

    // This method returns the price of the item.
    public double getPrice() {
        return this.price;
    }

    // This method returns the VAT (value-added tax) of the item.
    public double getVAT() {
        return this.VAT;
    }
}
