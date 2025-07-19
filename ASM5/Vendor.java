/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Vendor {

    private int id;
    private String name;
    private String address;
    private String phone;
    private double sale;

    public Vendor() {
        setId(0);
        setName("");
        setAddress("");
        setPhone("");
        setSale(0);
    }

    public Vendor(int id, String name, String address, String phone, double sale) {
        setId(id);
        setName(name);
        setAddress(address);
        setPhone(phone);
        setSale(sale);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return toTitleCase(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;

        } else {
            this.name = "No Name";
        }
    }

    public String getAddress() {
        return toTitleCase(address);
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;

        } else {
            this.address = "No Address";
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String regex = "^0\\d{9,10}$";
        if (phone.matches(regex)) {
            this.phone = phone;
        } else {
            this.phone = "No Phone";
        }
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        if (sale >= 100 && sale <= 5000000) {
            this.sale = sale;
        } else {
            this.sale = 100;
        }
    }

    public String toTitleCase(String value) {
        String[] arr = value.split(" ");
        String result = "";
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
        return String.format("%f,%s,%s,%s,%.3f", getId(), getName(), getAddress(), getPhone(), getSale());
    }
    
}
