package se.kth.iv1350.integration;

public class ExternalAccounting {
    private double accountingBalance; 

    public ExternalAccounting(){
        this.accountingBalance = 500;
    }

    public double getInitialBalance(){
        return this.accountingBalance; 
    }

    public void updateAccounting(double paidAmount){
        this.accountingBalance += paidAmount; 
    }
}
