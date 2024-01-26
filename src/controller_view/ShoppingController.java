/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller_view;

import model.Fruit;
import model.Shopping;

/**
 *
 * @author admin
 */
public class ShoppingController extends Menu{
    
    private Shopping shop;
    private Library library;

    public ShoppingController() {
        super("Shop fruit", new String[] {"Create Fruit", "View Order", "Shopping(for buyer)", "Exit"});
        shop = new Shopping();
        library = new Library();
    }
    
    
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                createFruit();
                break;
            case 2: 
                viewOrder();
                break;
            case 3: 
                shopping();
                break;
            case 4:
                exitMenu();

        }
    }
    
    public void createFruit() {
        String nameF = library.getString("Enter the name of fruit");
        double price = library.getDouble("Enter the price of fruit");
        int quantity = library.getInt("Enter the quantity");
        String origin = library.getString("Enter the origin");
        
        Fruit f = new Fruit(nameF, price, quantity, origin);
        shop.createFruits(f);
    }
    
    public void viewOrder() {
        shop.viewOrder();
    }
    
    public void shopping() {
        shop.listFruits();
        int choice = library.getInt("Enter your item choice");
        int quantity = library.getInt("Enter the quantity of item");
        String cus = library.getString("Enter the name of customer");
        shop.doShopping(choice, quantity, cus);
    }
    
}
