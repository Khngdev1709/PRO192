
public class Tester {

    public static void main(String[] args) {
        Car VinFast = new Car();
        VinFast.pressStartButton();
        VinFast.pressAcceleratorButton();
        VinFast.output();
        
        Car BYD = new Car("Black", 150, true, true);
        BYD.pressAcceleratorButton();
        BYD.setColour("Grey");
        System.out.println("Colour of BYD : " + BYD.getColour());
        BYD.output();
    }
}
