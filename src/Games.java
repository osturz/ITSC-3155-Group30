/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ostur
 */
public class Games {
    
    private String name;
    private double price;
    private String[] categories;
    
    public Games(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.categories = tags;
    }
     
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String getPriceString() {
        return Double.toString(this.price);
    }
}
