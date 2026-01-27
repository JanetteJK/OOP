abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String fuel;
    protected String type;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency){
        this.fuel = fuel;
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting..");
    }
    @Override
    public void stop(){
        System.out.println(type + " is stopping...");
    }
    public void getInfo(){
        System.out.println(type + fuel);
    }

    public void charge(){
        if (fuel.equals("Electricity")){
            System.out.println("charging...");
        }
        else {
            System.out.println("Cannot be charged");
        }
    }

    @Override
    public void calculateFuelEfficiency() {
        if (fuel.equals("Electricity")){
            System.out.println(fuelEfficiency + " kWh");
        }
        else {
            System.out.println(fuelEfficiency + " liter per kilometer");
        }
    }
}
