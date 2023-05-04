package se.kth.iv1350.integration;

/**
 * Class Item represents a singular item within the sale.
 */
public class Item {
    private ItemDescription itemDescription; 
    private int itemIdentifier; 
    private double quantity; 
    private double storeQuantity;

    /**
     * Creates an instance of the Item Class 
     * @param itemIdentifier The item identifier number entered when scannign items
     * @param itemDescription The specific details of the entered item 
     * @param quantity The quantity of items
     */
    public Item(int itemIdentifier, ItemDescription itemDescription, double storeQuantity){
        this.itemIdentifier = itemIdentifier; 
        this.storeQuantity = storeQuantity;
        this.itemDescription = itemDescription;
        quantity = 0;  
    }

    public int getItemIdentifier(){
        return this.itemIdentifier; 
    }

    public double getQuantity(){
        return quantity; 
    }

    public double getStoreQuantity(){
        return this.storeQuantity;
    }

    public ItemDescription getItemDescription(){
        return this.itemDescription; 
    }

    public void setQuantity(double newQuantity) {
        quantity = newQuantity;
    } 

    public void setStoreQuantity(double newStoreQuantity){
        this.storeQuantity = newStoreQuantity;
    }
}
