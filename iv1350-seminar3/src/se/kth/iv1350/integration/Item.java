package se.kth.iv1350.integration;

// This class represents an item with its corresponding item description, item identifier, quantity and store quantity.
public class Item {
    private ItemDescription itemDescription; // The description of the item.
    private int itemIdentifier; // The unique identifier of the item.
    private double quantity; // The quantity of the item.
    private double storeQuantity; // The quantity of the item in the store.

    // The constructor for the item.
    public Item(int itemIdentifier, ItemDescription itemDescription, double storeQuantity){
        this.itemIdentifier = itemIdentifier;
        this.storeQuantity = storeQuantity;
        this.itemDescription = itemDescription;
        quantity = 0;  // The quantity is initialized to 0.
    }

    // Getter method to get the item identifier.
    public int getItemIdentifier(){
        return this.itemIdentifier;
    }

    // Getter method to get the quantity of the item.
    public double getQuantity(){
        return quantity;
    }

    // Getter method to get the store quantity of the item.
    public double getStoreQuantity(){
        return this.storeQuantity;
    }

    // Getter method to get the item description.
    public ItemDescription getItemDescription(){
        return this.itemDescription;
    }

    // Setter method to set the quantity of the item.
    public void setQuantity(double newQuantity) {
        quantity = newQuantity;
    }

    // Setter method to set the store quantity of the item.
    public void setStoreQuantity(double newStoreQuantity){
        this.storeQuantity = newStoreQuantity;
    }
}
