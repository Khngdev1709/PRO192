
package DTO;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Item {
    private int value;
    private String creator;

    public Item(int value, String creator) {
        setValue(value);
        setCreator(creator);
    }

    public Item() {
        setValue(0);
        setCreator("");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0) {
        this.value = value;
        }
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        if (creator != null && !creator.isEmpty()) {
        this.creator = creator;
        }
    }
    public void input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value : ");
        value = sc.nextInt();
        sc.nextLine();
        System.out.println("Input creator : ");
        creator = sc.nextLine();
    }
    public void output () {
        System.out.println("Value : " + value);
        System.out.println("Creator : " + creator);
    }
    
    
}
