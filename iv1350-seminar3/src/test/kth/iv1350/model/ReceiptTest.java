package test.kth.iv1350.model;

import org.junit.Test;  
import static org.junit.Assert.assertTrue;
import se.kth.iv1350.controller.*;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;
import se.kth.iv1350.startup.*;
import se.kth.iv1350.view.*;
import java.time.LocalDateTime; 

public class ReceiptTest {

    @Test
    public void testReceipt(){
        int itemIdentifier = 2;
        String name = "Banan";
        double price = 10.0;
        double VAT = 0.25;
        double quantity = 10.0;
        double storeQuantity = 500.0;
        LocalDateTime dateAndTime;  
        SaleDTO saleInfo;
        double runningTotal = 650.0; 
        double addedVAT; 
        double paidAmount = 400.0;

        ItemDescription itemDescription = new ItemDescription(name, price, VAT);
        Sale sale = new Sale();
        sale.getSaleInfo();
        
        Payment payment = new Payment(paidAmount, runningTotal);
        Receipt receipt = new Receipt(sale, payment);
        String expectedResult = 
        
    }
}
