public class Bus extends AbstractVehicle{

    private int capacity;

    public Bus(String type, String fuel, int capacity){
        this.type = type;
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting..");
    }
    @Override
    public void stop(){
        System.out.println(type + " is stopping...");
    }
    @Override
    public void getInfo(){
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
        System.out.println("Capacity: " + capacity + " passengers.");
    }
}
