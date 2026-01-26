public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 80);
        myCar.fillTank();
        myCar.turnOn(1);

        while (myCar.cruiseControl()) {
            myCar.setTargetSpeed(100);
            System.out.println("Current target speed is: " + myCar.getTargetSpeed() + " km/h");
            System.out.println(myCar.getSpeed());
            if (myCar.getSpeed() > myCar.getTargetSpeed()) {
                myCar.decelerate(10);
            }
            else if (myCar.getSpeed() < myCar.getTargetSpeed()) {
                myCar.accelerate();
            }

        }


        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}