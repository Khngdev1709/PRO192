
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class SingerList extends ArrayList<Singer> {

    public Singer getSingerById(int id) {
        for (Singer s : this) {
            if (s.getSingerId() == id) {
                return s;
            }
        }
        return null;
    }

    public int countSingersWithSongsAbove(int threshold) {
        int count = 0;
        for (Singer s : this) {
            if (s.getSongsCount() > threshold) {
                count++;
            }
        }
        return count;
    }
}
