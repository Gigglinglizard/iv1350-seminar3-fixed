package se.kth.iv1350.integration;

import java.util.*;
import se.kth.iv1350.model.*;

public class ExternalInventory {
    private List<Item> storeItems = new ArrayList<>();
	private List<ItemDescription> itemDescriptions = new ArrayList<>();

    public ExternalInventory(){
        addItem();
    }
    
    public void addItem() {
        this.itemDescriptions.add(new ItemDescription("Banan", 10.0, 0.25)); 
		this.itemDescriptions.add(new ItemDescription("Köttbullar 500g", 43.0, 0.12));
		this.itemDescriptions.add(new ItemDescription("Mjölk", 17.0, 0.06));
		this.itemDescriptions.add(new ItemDescription("Cola 2l", 29.0, 0.12));

		this.storeItems.add(new Item(1, itemDescriptions.get(0), 300.0));
		this.storeItems.add(new Item(2, itemDescriptions.get(1), 400.0));
		this.storeItems.add(new Item(3, itemDescriptions.get(2), 100.0));
		this.storeItems.add(new Item(4, itemDescriptions.get(3), 150.0));
    }

    public Item retrieveItem(int itemIdentifier){
        for (Item item: storeItems){
            if (item.getItemIdentifier() == itemIdentifier){
                return item;
            }
        }
    return null; 
    }

    public void updateInventory(Sale sale) {
        List<Item> items = sale.getItems();
        for (Item item : items) {
            for (Item storeItem : storeItems) {
                if (item.getItemIdentifier() == (storeItem.getItemIdentifier())) {
                    double itemQuantity = item.getQuantity();
                    double storeItemQuantity = storeItem.getStoreQuantity();

                    storeItem.setStoreQuantity(storeItemQuantity - itemQuantity);
                }
            }
        }
    }
}
