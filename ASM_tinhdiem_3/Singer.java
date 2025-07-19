/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Singer {

    protected int singerId;
    protected String name;
    protected int songsCount;

    public Singer() {
        setSingerId(0);
        setName("");
        setSongsCount(0);
    }

    public Singer(int singerId, String name, int songsCount) {
        setSingerId(singerId);
        setName(name);
        setSongsCount(songsCount);
    }

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public void setSongsCount(int songsCount) {
        this.songsCount = songsCount;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%d", singerId, name, songsCount);
    }
    

}
