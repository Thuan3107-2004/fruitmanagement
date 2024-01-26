/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Fruit {
    private int id;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit(int id, String fruitName, double price, int quantity, String origin) {
        this.id = id;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public Fruit(String fruitName, double price, int quantity, String origin) {
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public double getAmount() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", fruitName=" + fruitName + ", price=" + price + ", quantity=" + quantity + ", origin=" + origin + '}';
    }
    
    
}
