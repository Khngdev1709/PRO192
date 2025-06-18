/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public abstract class Beverage {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Beverage() {
        setId("");
        setName("");
        setPrice(0);
        setQuantity(0);
    }

    public Beverage(String id, String name, double price, int quantity) {
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String regex = "^[A-Za-z]{2}\\d{3}$";
        if (id != null && !id.isEmpty() && id.matches(regex)) {
            this.id = id;
        } else {
            this.id = "TN000";
        }
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
            this.name = name;
        } else {
            this.name = "new beverage";
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 5000) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 1 && quantity <= 100) {
            this.quantity = quantity;
        } else {
            this.quantity = 1;
        }
    }

    public String toTitleCase(String value) {
        String result = "";
        String[] arr = value.split(" ");
        for (String word : arr) {
            if (word.trim().length() > 0) {
                String newWord = word.substring(0, 1).toUpperCase()
                        + word.substring(1).toLowerCase();
                result += newWord + " ";
            }
        }
        return result.trim();
    }

    public abstract double subTotal();

    @Override
    public String toString() {
        return String.format("%s,%s,%.3f,%d,%.3f", getId(), getName(), getPrice(), getQuantity(), subTotal());
    }
}
