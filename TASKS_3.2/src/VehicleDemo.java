public class VehicleDemo {
    public static void main(String[]args){
        Vehicle car = new Car("Car", "Petrol", "Red");
        Vehicle moto = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Vehicle bus = new Bus("Bus", "Diesel", 40);

        car.start();
        car.stop();
        car.getInfo();

        moto.start();
        moto.stop();
        moto.getInfo();

        bus.start();
        bus.stop();
        bus.getInfo();

    }
}
