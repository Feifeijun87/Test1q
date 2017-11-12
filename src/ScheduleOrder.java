
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUSPC
 */
public class ScheduleOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Please Select The day you want to schedule your order");
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday");
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Please select the restaurant you want to order");
        System.out.println("1.SPX Restaurant\n 2.XXXRestaurant\n");
        System.out.println("Choice: ");
        int restaurant = input.nextInt();
        String meal = order(restaurant);
        
        
    }
    public static String order(int restaurant){
    String order="";
    if (restaurant ==1){
    
    }
    
    return order;
    }
    
    
}
