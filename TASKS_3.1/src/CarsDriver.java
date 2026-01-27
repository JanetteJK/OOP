public class CarsDriver {
    public static void main(String[]args) {
        Car myCar;
        Bus myBus;
        SportsCar mySportsCar;

        myCar = new Car("Toyota", 80, 0,0, 20, 5);
        myCar.fillTank();
        myCar.accelerate();
        System.out.println(myCar.getTypeName());
        System.out.println(myCar.getGasolineLevel());
        System.out.println(myCar.getCurrentSpeed());

        myBus = new Bus("Buss", 150, 0,0, 20, 10);
        myBus.fillTank();
        System.out.println(myBus.getTypeName());
        System.out.println(myBus.getGasolineLevel());
        myBus.passengersEnter(20);
        myBus.passengersExit(7);

        mySportsCar = new SportsCar("Fast", 80, 0, 0, 35, 15);
        mySportsCar.fillTank();
        System.out.println(mySportsCar.getGasolineLevel());
        System.out.println(mySportsCar.getTypeName());
        mySportsCar.accelerate();
        mySportsCar.accelerate();
        mySportsCar.fillTank();
        mySportsCar.accelerate();
        mySportsCar.accelerate();
        mySportsCar.decelerate();
        System.out.println(mySportsCar.getCurrentSpeed());


    }
}
