public class Car extends AbstractVehicle{
    private String color;

    public Car(String type, String fuel, String color){
        super(type,fuel);
        this.color = color;
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
        System.out.println("Color: " +  color);
    }
}
