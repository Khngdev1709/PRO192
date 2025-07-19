
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class VendorList extends ArrayList<Vendor> {

    public void addVendor(Vendor v) {
        this.add(v);
    }

    public double getVendorSaleById(int id) {
        for (Vendor v : this) {
            if (v.getId() == id) {
                return v.getSale();
            }
        }
        return Double.parseDouble(String.format("%.3f", (double) id));
    }

    public Vendor VendorWithMaxSale() {
        if (this.isEmpty()) {
            return null;
        }
        Vendor max = this.get(0);
        for (Vendor v : this) {
            if (v.getSale() > max.getSale()) {
                max = v;
            }
        }
        return max;
    }

    public double TotalSaleAllVendors() {
        double total = 0;
        for (Vendor v : this) {
            total += v.getSale();
        }
        return total;
    }

    public void printVendorList() {
        Collections.sort(this, new Comparator<Vendor>() {
            @Override
            public int compare(Vendor v1, Vendor v2) {
                if (v1.getSale() != v2.getSale()) {
                    return Double.compare(v2.getSale(), v1.getSale()); //decrease down
                } else {
                    return v1.getName().compareTo(v2.getName());       //increase by name
                }
            }
        });
        for (Vendor v : this) {
            System.out.println(v);
        }
    }
}
