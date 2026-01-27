public class Bus extends AbstractVehicle{
    private int capacity;

    public Bus(String type, String fuel, int capacity, double fuelEfficiency){
        super(type, fuel,fuelEfficiency);
        this.capacity = capacity;
    }

    @Override
    public void getInfo(){
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers.");
    }
}
