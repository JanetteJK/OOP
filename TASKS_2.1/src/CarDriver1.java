public class CarDriver1 {
    public static void main(String[] args) {
        Car1 myCar;

        myCar = new Car1("Toyota Corolla", 140, 50);
        myCar.fillTank();
        myCar.getGasolineLevel();

       /* for (int i = 0; i < 10; i++){
            myCar.accelerate();
            System.out.println("Car " + myCar.getTypeName() + " is driving " + myCar.getSpeed() + " km/h");
            myCar.decelerate(5);
        }
        */

        myCar.targetSpeed(100);
        myCar.turnOnCruise();

        while (myCar.isCruiseOn()) {
            myCar.cruiseControl();
        }


    }
}