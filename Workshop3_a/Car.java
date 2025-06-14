public class Car {
    private String colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBreak;

    public Car() {
        this.colour = "";
        this.EnginePower = 0;
        this.Convertible = false;
        this.ParkingBreak = false;
    }

    public Car(String colour, int EnginePower, boolean Convertible, boolean ParkingBreak) {
        this.colour = colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBreak = ParkingBreak;
    }
    public void pressStartButton () {
        System.out.println("You have pressed the car button");
    }
    public void pressAcceleratorButton () {
        System.out.println("You have pressed accelerator button");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBreak() {
        return ParkingBreak;
    }

    public void setParkingBreak(boolean ParkingBreak) {
        this.ParkingBreak = ParkingBreak;
    }
    public void output () {
        System.out.println("Colour : " + colour);
        System.out.println("Engine Power : " + EnginePower);
        System.out.println("Convertible : " + Convertible);
        System.out.println("Parking Break : " + ParkingBreak);
    }
    
    
}
