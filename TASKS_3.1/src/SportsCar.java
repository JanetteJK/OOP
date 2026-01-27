public class SportsCar extends Car {


    public SportsCar(String typeName, int gasolineLevel, int speed, int gasolineTankCapacity) {
        super(typeName, gasolineLevel, speed, gasolineTankCapacity);
    }
    @Override
    public void accelerate() {
        super.accelerate();
        if (getGasolineLevel() > 0){
            setSpeed(getSpeed() + 30);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0 && amount > 0){
            setSpeed(getSpeed() - amount * 2);
        }
    }
}


