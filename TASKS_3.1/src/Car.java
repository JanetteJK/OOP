public class Car {
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCapacity;
    private int speed;
    private int breakGas;
    private int currentSpeed;
    private int gasConsumption;


    public Car(String typeName, double gasolineTankCapacity, double gasolineLevel, int speed, int breakGas, int gasConsumption) {
        this.typeName = typeName;
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.speed = speed;
        this.breakGas = breakGas;
        this.gasolineLevel = gasolineLevel;
        this.gasConsumption = gasConsumption;
        currentSpeed = 0;




    }
    public int getCurrentSpeed() {
        return currentSpeed;
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

    public void accelerate() {
        if (gasolineLevel > gasConsumption) {
            gasolineLevel -= gasConsumption;
            currentSpeed += breakGas;
        } else {
            System.out.println("Out of gas");
            currentSpeed = 0;
        }

    }

    public void decelerate() {
        if (gasolineLevel > gasConsumption) {
            gasolineLevel -= gasConsumption;
            if (breakGas > 0)
                currentSpeed -= breakGas;
        } else {
            System.out.println("Out of gas");
            currentSpeed = 0;
        }
    }

}