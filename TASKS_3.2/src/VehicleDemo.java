public class VehicleDemo {
    public static void main(String[]args){
        Vehicle car = new Car("Car", "Petrol", "Red", 7.5);
        Vehicle moto = new Motorcycle("Motorcycle", "Gasoline", "Black", 4.2);
        Vehicle bus = new Bus("Bus", "Diesel", 40, 12.2);
        ElectricVehicle elec = new ElectricCar("Car", "Electricity", "Blue", 7.2);
        ElectricVehicle elecm = new ElectricMotorcycle("Motorcycle", "Electricity", "Green", 3.4);

        car.start();
        car.stop();
        car.getInfo();
        car.charge();

        moto.start();
        moto.stop();
        moto.getInfo();


        bus.start();
        bus.stop();
        bus.getInfo();
        bus.calculateFuelEfficiency();

        elec.getInfo();
        elec.stop();
        elec.charge();
        elec.calculateFuelEfficiency();

        elecm.getInfo();
        elecm.start();
        elecm.charge();



    }
}
