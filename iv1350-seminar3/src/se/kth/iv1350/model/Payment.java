package se.kth.iv1350.model;

public class Payment {
    private double paidAmount;
    private double runningTotal;
    private double change;

    public Payment(double paidAmount, double runningTotal){
        this.paidAmount = paidAmount; 
        this.runningTotal = runningTotal;
    }

    public double getPaidAmount(){
        return paidAmount;
    }

    public double getRunningTotal(){
        return runningTotal; 
    }

    public double getChange(){
        change = paidAmount - runningTotal; 
        return change; 
         
    }
}
