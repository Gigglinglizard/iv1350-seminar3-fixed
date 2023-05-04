package test.kth.iv1350.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;
import java.util.*;


public class SaleTest {
    private Item item1;
    private Item item2; 
    private Sale sale;
    private ItemDescription itemDescription1;
    private ItemDescription itemDescription2;

    @Test
    public void addItem()  {
        sale = new Sale();
        itemDescription1 = new ItemDescription("Dragon Fruit", 40.0, 0.25);
        itemDescription2 = new ItemDescription("Canned Beans", 55.0, 0.12);
        item1 = new Item(2, itemDescription1, 500.0);
        item2 = new Item(4, itemDescription2, 250.0);
        
        sale.addItem(item1);
        sale.addItem(item2);
        List<Item> items = sale.getItems();

        assertEquals(2, items.size());
        assertTrue(items.contains(item1));
        assertTrue(items.contains(item2));
    }

    @Test
    public void calculateCost() {
        sale = new Sale();
        itemDescription1 = new ItemDescription("Dragon Fruit", 40.0, 0.25);
        itemDescription2 = new ItemDescription("Canned Beans", 55.0, 0.12);
        item1 = new Item(2, itemDescription1, 500.0);
        item2 = new Item(4, itemDescription2, 250.0);

        sale.calculateCost(item1, 1.0, sale);
        sale.calculateCost(item2, 1.0, sale); 

        assertEquals(111.6, sale.getSaleInfo().getRunningTotal(), 0.001);
        assertEquals(16.6, sale.getSaleInfo().getAddedVAT(), 0.001);
    }
}




    