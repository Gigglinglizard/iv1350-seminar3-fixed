package test.kth.iv1350.model;


import se.kth.iv1350.integration.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


    

    public class ItemTest {
        private Item item;
        private int itemIdentifier;
        private ItemDescription itemDescription;
        private double storeQuantity;
        private double quantity;
        private String name;
        private double price;
        private double VAT;

    
    public void setUp() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        quantity = 10.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity);
    }

    @Test
    public void getItemDescription() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity);
        assertEquals(itemDescription, item.getItemDescription());
    }

    @Test
    public void getItemIdentifier() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity);
        assertEquals(itemIdentifier, item.getItemIdentifier());
    }

    @Test
    public void getQuantity() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        quantity = 10.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity); 
        assertEquals(0.0, item.getQuantity(), 0.001); 
    }

    @Test
    public void getStoreQuantity() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        quantity = 10.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity); 
        assertEquals(500.0, item.getStoreQuantity(), 0.001);
    }

    @Test
    public void setQuantity() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        quantity = 10.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity); 
        item.setQuantity(25.0);
        assertEquals(25.0, item.getQuantity(), 0.001);
    }

    @Test
    public void setStoreQuantity() {
        name = "banan";
        price = 10.0;
        VAT = 0.06;
        itemIdentifier = 2;
        storeQuantity = 500.0;
        quantity = 10.0;
        itemDescription = new ItemDescription(name, price, VAT);
        item = new Item(itemIdentifier, itemDescription, storeQuantity);
        item.setStoreQuantity(20);
        assertEquals(20, item.getStoreQuantity(), 0);
    }
}