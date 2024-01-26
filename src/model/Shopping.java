/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Shopping {

    private FruitList fruitList;
    private Hashtable<String, ArrayList<Fruit>> shops;

    public List<Fruit> getFruits() {
        return fruitList.getFruits();
    }

    public Shopping() {
        shops = new Hashtable<>();
        fruitList = new FruitList();
    }

    public void listFruits() {
        for (Fruit f : fruitList.getFruits()) {
            System.out.println(f);
        }
    }

    private void listOrder(List<Fruit> fs) {
        double total = 0;
        for (Fruit f : fs) {
            total += f.getAmount();
            String productDetails = String.format(
                    "Product: %9s | Quantity: %d | Price: %.2f$ | Amount: %.2f$", f.getFruitName(),
                    f.getQuantity(), f.getPrice(), f.getAmount());
            System.out.println(productDetails);
        }
        System.out.println("Total: " + total);
    }

    public void createFruits(Fruit f) {
        int i = getFruits().size() + 1;
        f.setId(i);
        getFruits().add(f);
    }

    public void viewOrder() {
        Enumeration<String> customers = shops.keys();

        while (customers.hasMoreElements()) {
            String customer = customers.nextElement();
            System.out.println("Customer: " + customer);
            List<Fruit> fs = shops.get(customer);
            listOrder(fs);
        }
    }

    public void doShopping(int choice, int quantity, String cusName) {
        if (choice <= 0 && choice > getFruits().size()) {
            System.out.println("Not found item with choice: " + choice);
            return;
        }

        ArrayList<Fruit> fs = new ArrayList<>();
        Fruit f = fruitList.getFruits().get(choice - 1);
        if(f.getQuantity() - quantity < 0) {
            System.out.println("Not enough quantity to buy");
            return;
        } 
        Fruit fNew = fruitList.getFruits().set(choice - 1, new Fruit(f.getId(), f.getFruitName(), f.getPrice(), f.getQuantity() - quantity, f.getOrigin()));
        f.setPrice(quantity);
        fs.add(f);
        shops.put(cusName, fs);
    }

//    public static void main(String[] args) {
//        Shopping s = new Shopping();
////        s.listFruits(); 
//        s.doShopping(1, 2, "dat");
//        s.doShopping(2, 3, "Hat");
//        s.createFruits(new Fruit(4, "Dua leo", 0, 1, "Japanese"));
//        s.doShopping(4, 3, "Huy");
//        s.viewOrder();
//    }

}
