package br.com.mariojp.solid.srp;

public class TaxCalculator{
    private double taxRate;
    public TaxCalculator(){
        String taxRateProperty = System.getProperty("tax.rate","0,08");
        this.taxRate = Double.parseDouble(taxRateProperty);
    }
    public double calculateTax(double amount){
        return amount * taxRate;
    }
    public double getTaxRate(){
        return taxRate;
    }
}