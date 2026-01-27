public class CarsDriver {
    public static void main(String[]args) {
        Car myCar;
        Bus myBus;
        SportsCar mySportsCar;

        myCar = new Car("Toyota", 80);
        myCar.fillTank();
        myCar.accelerate();
        System.out.println(myCar.getTypeName());
        System.out.println(myCar.getGasolineLevel());
        System.out.println(myCar.getSpeed());

        myBus = new Bus("Buss", 150 );
        myBus.fillTank();
        System.out.println(myBus.getTypeName());
        myBus.passengersEnter(20);
        myBus.passengersExit(7);

        mySportsCar = new SportsCar("Fast", 70 );
        mySportsCar.fillTank();
        System.out.println(mySportsCar.getGasolineLevel());
        System.out.println(mySportsCar.getTypeName());
        mySportsCar.sportCarAccelerate();
        mySportsCar.sportCarDecelerate();
        System.out.println(mySportsCar.getSpeed());


    }
}
