
public class Tester {

    public static void main(String[] args) {
        Guitar Canon = new Guitar();
        Guitar Sony = new Guitar("G63", 7800, "Sony", "Digital", "hardWood", "softWood");
        System.out.println("State of Canon:");
        Canon.createSound();
        System.out.println("State of Sony:");
        Sony.createSound();

        System.out.println("set price = 6800 of Canon");
        Canon.setPrice(6800);
        System.out.println("get price of Canon:" + Canon.getPrice());
    }
}
