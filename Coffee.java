/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Coffee extends Beverage {

    private int expire;
    private String type;

    public Coffee() {
        super();
        setExpire(0);
        setType("");
    }

    public Coffee(String id, String name, double price, int quantity, String type, int expire) {
        super(id, name, price, quantity);
        setExpire(expire);
        setType(type);
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        if (expire >= 1 && expire <= 180) {
            this.expire = expire;
        } else {
            this.expire = 180;
        }
    }

    public String getType() {
        return toTitleCase(type);
    }

    public void setType(String type) {
        if (type != null && !type.equalsIgnoreCase("special") && !type.equalsIgnoreCase("high") && !type.equalsIgnoreCase("medium") && !type.equalsIgnoreCase("low")) {
            this.type = "medium";
        } else {
            this.type = type.toLowerCase();
        }
    }

    @Override
    public double subTotal() {
        double rate = 1.0;
        if (this.type.equalsIgnoreCase("special") || getId().startsWith("DB")) {
            rate = 1.2;
        } else if (this.type.equalsIgnoreCase("high") || getId().startsWith("HC")) {
            rate = 1.1;
        } else if (this.type.equalsIgnoreCase("medium") || getExpire() <= 30) {
            rate = 0.5;
        } 
        return getPrice() * getQuantity() * rate;
    }

    @Override
    public String toTitleCase(String value
    ) {
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

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.3f,%d,%.3f", getId(),getName(),getType(),getExpire(),getPrice(),getQuantity(),subTotal());
    }
    
}
