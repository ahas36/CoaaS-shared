/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdql.csd;

/**
 *
 * @author ali
 */
public class ServiceCost {
    private String priceCurrency;
    
    private double price;

    public ServiceCost() {
    }

    public ServiceCost(String priceCurrency, double price) {
        this.priceCurrency = priceCurrency;
        this.price = price;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
