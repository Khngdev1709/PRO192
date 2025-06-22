/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ADMIN
 */
public class BeeColony extends Colony implements Role {
    private String type;

    public BeeColony(String type) {
        setType("");
    }

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the wok of the bees");
    }

    @Override
    public String toString() {
        return "the colony's type is " + type + ", size is about " + size + ", and the place is " + place;
    } 
}
