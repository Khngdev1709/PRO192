/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Vase extends Item {
    private int height;
    private String materials;

    public Vase(int value, String creator ,int height, String materials) {
        super(value, creator);
        setHeight(height);
        setMaterials(materials);
    }

    public Vase() {
        super (0,"");
        setHeight(0);
        setMaterials("");
        
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
    public void inputVase() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height: ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a materials: ");
        materials = sc.nextLine();
    }
    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + materials);
    }
    
}
