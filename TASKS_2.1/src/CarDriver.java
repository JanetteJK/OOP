import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar;

        myCar = new Car("Toyota Corolla", 80);
        myCar.fillTank();
        myCar.turnOn(0);


        System.out.println("Do you want to turn on cruise control? 1 to turn on, 0 to not.");
        int get = scanner.nextInt();
        if (get == 1) {
            myCar.turnOn(1);
        }
        while (myCar.cruiseControl()) {
            System.out.println("Set the speed for cruising: ");
            int speed = scanner.nextInt();
            myCar.setTargetSpeed(speed);
            System.out.println("Current target speed is: " + myCar.getTargetSpeed() + " km/h");

            while (myCar.getSpeed() < myCar.getTargetSpeed()) {

                if (myCar.getSpeed() > myCar.getTargetSpeed()) {
                    int breaks = myCar.getSpeed() - myCar.getSpeed();
                    System.out.println(breaks);
                    myCar.decelerate(breaks);

                } else if (myCar.getSpeed() < myCar.getTargetSpeed()) {
                    System.out.println("Current speed is " + myCar.getSpeed());
                    myCar.accelerate();
                }


            }
            System.out.println("Reached target speed, press 1 to turn off cruise control");
            int ans = scanner.nextInt();
            if (ans == 1) {
                myCar.turnOn(0);
        }
    }
}}



/*
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

 */