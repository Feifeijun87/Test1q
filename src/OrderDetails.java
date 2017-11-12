/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUSPC
 */
public class OrderDetails {
    private Meal meal;
    private int quantity=0;
    private double price;

    public OrderDetails(Meal meal,int quantity) {
        this.meal = meal;
        this.quantity=quantity;
         
    }

    public Meal getMeal() {
        return meal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void calculatePrice(){
        price=((Meal)meal).getUnitPrice();
    
    }
    
  

    
    
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String str="";
               
              str  += String.format("%-30s%-12dRM%-5.2f\n",((Meal)meal).getName(),getQuantity(),((Meal)meal).getUnitPrice());
              return str;
    }
    
    
    
    
}
