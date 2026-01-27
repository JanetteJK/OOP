public class Car {
    private int gasolineLevel;
    private String typeName;
    private int gasolineTankCapacity;
    private int speed;

    public Car(String typeName, int gasolineTankCapacity, int gasolineLevel, int speed) {
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
        this.gasolineLevel = gasolineLevel;
    }
    protected void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        gasolineLevel = gasolineTankCapacity;
    }

    public int getSpeed(){
        return speed;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {;
            speed += 5;
            gasolineLevel -=1;
        } else {
            System.out.println("Out of gas");
            speed = 0;
        }

    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0){
                speed = Math.max(0, speed - amount);
        } else {
            System.out.println("Out of gas");
            speed = 0;
        }}
    }


}