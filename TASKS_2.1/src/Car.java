public class Car {

    private int speed = 0;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCapacity;
    private boolean cruiseControl;
    private double targetSpeed;
    private boolean on = false;


    public Car(String typeName, int gasolineTankCapacity) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        targetSpeed = 0;
    }

    public void turnOn(int setting){
        if (setting == 0) {
            on = false;
            System.out.println("Cruise control turned off.");
        }
        if (setting == 1) {
            on = true;
            System.out.println("Cruise control turned on.");
        }
    }

    public boolean cruiseControl() {
        if (on) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setTargetSpeed(double max) {
        if (max > 100 || max < 50) {
            System.out.println("Target speed outside of range, turning off cruise control");
            on = false;
        }
        targetSpeed = max;

    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    int getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }
}