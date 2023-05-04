package test.kth.iv1350.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;
import java.time.*;
import java.util.*;


public class SaleTest {
    private Item item1;
    private Item item2;
    private Sale sale;
    private int itemIdentifier;
    private ItemDescription itemDescription1;
    private ItemDescription itemDescription2;
    private double storeQuantity;
    private double quantity;
    private String name;
    private double price;
    private double VAT;

    @Test
    public void testAddItem() {

        sale = new Sale();
        item1 = new Item(2, itemDescription1, 500.0);
        item2 = new Item(4, itemDescription2, 250.0);
        itemDescription1 = new ItemDescription("Dragon Fruit", 40.0, 0.25);
        itemDescription2 = new ItemDescription("Canned Beans", 55.0, 0.12);
        
        sale.addItem(item1);
        sale.addItem(item2);
        List<Item> items = sale.getItems();

        assertEquals(2, items.size());
        assertTrue(items.contains(item1));
        assertTrue(items.contains(item2));
    }

    @Test
    public void testIsSameItem() {
        sale = new Sale();
        boolean correctItem = false;
        item1 = new Item(2, itemDescription1, 500.0);
        item2 = new Item(4, itemDescription2, 250.0);
        itemDescription1 = new ItemDescription("Dragon Fruit", 40.0, 0.25);
        itemDescription2 = new ItemDescription("Canned Beans", 55.0, 0.12);
        
        sale.addItem(item1);
        sale.addItem(item2);
        List<Item> items = sale.getItems();

        if (item1.getItemIdentifier() == (item2.getItemIdentifier())){
            correctItem = true;
        }

        assertEquals(2, items.size());
        assertTrue(items.contains(item2));
        assertEquals(false, correctItem);
    }

    @Test
    public void testCalculateCost() {
        sale.addItem(item1);
        sale.calculateCost(item1, 3, sale);
        SaleDTO saleInfo = sale.getSaleInfo();
        assertEquals(7.2, saleInfo.getRunningTotal());
        assertEquals(0.9, saleInfo.getAddedVAT());
    }
}