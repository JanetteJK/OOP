public class CarsDriver {
    public static void main(String[]args) {
        Car myCar;
        Bus myBus;
        SportsCar mySportsCar;

        myCar = new Car("Toyota", 80, 0,0);
        myCar.fillTank();
        myCar.accelerate();
        System.out.println(myCar.getTypeName());
        System.out.println(myCar.getGasolineLevel());

        myBus = new Bus("Buss", 150, 0,0);
        myBus.fillTank();
        System.out.println(myBus.getTypeName());
        System.out.println(myBus.getGasolineLevel());
        myBus.passengersEnter(20);
        myBus.passengersExit(7);

        mySportsCar = new SportsCar("Fast", 80, 0, 0);
        mySportsCar.fillTank();
        System.out.println(mySportsCar.getGasolineLevel());
        System.out.println(mySportsCar.getTypeName());
        mySportsCar.accelerate();
        mySportsCar.fillTank();
        mySportsCar.decelerate(5);
        System.out.println(mySportsCar.getSpeed());


    }
}
