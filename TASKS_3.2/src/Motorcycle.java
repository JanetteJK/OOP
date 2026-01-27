public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String type, String fuel, String color, double fuelEfficiency){
        super(type,fuel,fuelEfficiency);
        this.color = color;
    }

    @Override
    public void getInfo(){
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " +  color);
    }
}
