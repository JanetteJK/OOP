abstract class AbstractVehicle implements Vehicle {
    protected String fuel;
    protected String type;

    public AbstractVehicle(String fuel, String type){
        this.fuel = fuel;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting..");
    }

    public void stop(){
        System.out.println(type + " is stopping...");
    }


}
