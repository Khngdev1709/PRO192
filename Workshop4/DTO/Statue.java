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
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        setWeight(weight);
        setColour(colour);
    }

    public Statue() {
        super(0, "");
        setWeight(0);
        setColour("");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void inputStatue() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a weight: ");
        weight = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a colour: ");
        colour = sc.nextLine();
    }
    public void outputStatue() {
        output();
        System.out.println("Weight : " + weight);
        System.out.println("Colour : " + colour);
    }
}
