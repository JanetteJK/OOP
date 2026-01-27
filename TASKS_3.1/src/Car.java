public class Car {

    private int speed;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCapacity;


    public Car(String typeName, double gasolineTankCapacity) {
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
    }

    public void accelerate() {
        if (this.gasolineLevel > 0)
            this.speed += 10;
        else
            this.speed = 0;
    }

    public  void decelerate(int amount) {
        if (gasolineLevel > 0) {
            gasolineLevel -= 5;
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public  int getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }
}