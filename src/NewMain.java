

import java.util.ArrayList;
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
public class NewMain {
    
    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        Restaurant[] restaurant= new Restaurant[2];
        restaurant[0]=new Restaurant("XXX Restaurant","Setapak");
        restaurant[1]=new Restaurant("YYY Restaurant","Klang");
        
        Meal[] meal= new Meal[5];
        meal[0]=new Meal("Filet O Fish Burger",8.90,restaurant[0]);
        meal[1]=new Meal("Fried Rice",6.50,restaurant[1]);
        meal[2]=new Meal("Beef Burger",12.90,restaurant[0]);
        meal[3]=new Meal("Maggi Goreng",4.50,restaurant[1]);
        meal[4]=new Meal("French Fries",5.50,restaurant[0]);
        
        
        Schedule schedule;        
        Order order;
        OrderDetails[] orderDtl= new OrderDetails[10];
        
        String day,restaurantName,time;
        int quantity,orderCount=0,choice=0;
                
        day = selectDay();
        time=selectTime();
        Meal food;
            System.out.println("HI");
        do{
        restaurantName= selectRestaurant(restaurant);
        food=selectFood(meal,restaurantName);
        quantity=getQuantity();
        orderDtl[orderCount]= new OrderDetails(food,quantity);
        orderDtl[orderCount].calculatePrice();
        orderCount++;
            System.out.println("Do you want to reorder?(1=yes,2-no)");
            System.out.print("Choice: ");
            choice=input.nextInt();
        }while(choice==1);
        
        order= new Order(orderDtl);
        order.calculateTotal();
        schedule=new Schedule(order,day,time);
            System.out.println(schedule.toString());
        
    }
        public static int getQuantity(){
        int quantity;
        Scanner input= new Scanner(System.in);
       
            System.out.print("Quantity: ");
            quantity=input.nextInt();
            return quantity;
        }
        
        public static Meal selectFood(Meal[] meal, String restaurant){
        Scanner input=new Scanner(System.in);
        Meal foodOrdered=new Meal();
        int choice,count=1;
        String[] foodArr=new String[100];
            System.out.println("Please select the meal");
            for (int i=0;i<meal.length;i++){
            if (((Restaurant)((Meal)meal[i]).getRestaurant()).getName().equals(restaurant)){
            System.out.println(count+". "+meal[i].getName());
            
            foodArr[count]=meal[i].getName();
            count++;
            } 
            }
            System.out.print("Choice: ");
            choice=input.nextInt();
            
              for (int i=0;i<meal.length;i++){
                 
            if (((Meal)meal[i]).getName().equals(foodArr[choice])){
            
            foodOrdered.setName(meal[i].getName());
            foodOrdered.setUnitPrice(meal[i].getUnitPrice());
            foodOrdered.setRestaurant(meal[i].getRestaurant());
            
            } 
            
            }
              return foodOrdered;
        }
        
        
        public static String selectRestaurant(Restaurant[] restaurant){
            int choice=0;
        String restaurantName;
        Scanner input=new Scanner(System.in);
            System.out.println("Please select restaurant");
            for (int i=0;i<restaurant.length;i++){
                System.out.println((i+1)+". "+restaurant[i].getName());
            }
            System.out.print("Choice: ");
            choice=input.nextInt();
            restaurantName=restaurant[choice-1].getName();     
        
        
        return restaurantName;
        }
        
    public static String selectTime(){
        Scanner input= new Scanner(System.in);
    String time;
            int choice;
        System.out.println("Please select time (1-AM , 2-PM)");
        System.out.print("Choice: ");
        choice=input.nextInt();
        System.out.println("Please enter the time");
        input.nextLine();
        System.out.print("Time: ");
        time=input.nextLine();
        if(choice==1)
            time+="AM";
        else if (choice==2)
            time+="PM";
        
        return time;
    }    
    public static String selectDay(){
    Scanner input=new Scanner(System.in);
    int day=0;
    String str="";
        System.out.println("Please select the day you want to order (1=Monday,7=Sunday)");
        System.out.print("Day: ");
        day=input.nextInt();
        switch (day) {
            case 1:
                str="Monday";
                break;
            case 2:
                str="Tuesday";
                break;
            case 7:
                str="Sunday";
                break;
            case 3:
                str="Wednesday";
                break;
            case 4:
                str="Thursday";
                break;
            case 5:
                str="Friday";
                break;
            case 6:
                str="Saturday";
                break;
            default:
                break;
        }
      return str;
        
    }
    
    
}
