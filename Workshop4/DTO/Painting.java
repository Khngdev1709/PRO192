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
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting(int value, String creator,int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        setHeight(height);
        setWidth(width);
        setIsWatercolour(isWatercolour);
        setIsFramed(isFramed);
    }

    public Painting() {
        super(0,"");
        setHeight(0);
        setWidth(0);
        setIsWatercolour(false);
        setIsFramed(false);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void inputPainting() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height : ");
        height = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a width : ");
        width = sc.nextInt();
        sc.nextLine();
        System.out.println("Input water colour : ");
        isWatercolour = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Input framed : ");
        isFramed = sc.nextBoolean();
    }
    public void outputPainting() {
        output();
        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Water colour : " + isWatercolour);
        System.out.println("Framed : " + isFramed);
    }
}
