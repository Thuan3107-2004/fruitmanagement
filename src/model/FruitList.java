/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FruitList {

    private List<Fruit> fruits;

    public FruitList() {
        fruits = new ArrayList<>();
        Fruit f1 = new Fruit(1, "Apple", 2, 1, "VietNam");
        Fruit f2 = new Fruit(2, "Orangle", 2, 1, "VietNam");
        Fruit f3 = new Fruit(3, "Watermelon", 2, 1, "VietNam");

        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);

    }


    public List<Fruit> getFruits() {
        return fruits;
    }
    
    

}
