public class Car1 {
    private String typeName;
    private double speed;
    private double maxSpeed;
    private double gasolineLevel;
    private double gasolineTankCapacity;
    private boolean cruiseControlOn = false;
    private double cruiseSpeed;

    public Car1(String typeName, double maxSpeed, double gasolineTankCapacity){
        this.speed = 0;
        this.gasolineLevel = 0;
        this.typeName = typeName;
        this.maxSpeed = maxSpeed;
        this.gasolineTankCapacity = gasolineTankCapacity;

    }

    public void accelerate(){
        if (gasolineLevel > 0){
            this.speed += 10;
            gasolineLevel -= 2;
            System.out.println("Accelerating, speed: " + this.speed + " km/h");
        } else{
            System.out.println("Out of gas, car stopping.");
            this.speed = 0;
        }
    }

    public void decelerate(double amount){
        if (gasolineLevel > 0){
            if (amount > 0) {
                this.speed = Math.max(0, this.speed - amount);
                System.out.println("Decelerating..");
            }
        }else {
            System.out.println("Out of gas, car stopping.");
            this.speed = 0;
        }
    }

    public void targetSpeed(double cruiseSpeed){
         this.cruiseSpeed = cruiseSpeed;
    }

     void fillTank(){
        gasolineLevel = gasolineTankCapacity;
    }

    public String getTypeName(){
        return typeName;
    }

    public double getSpeed(){
        return speed;
    }

    public double getGasolineLevel(){
        return gasolineLevel;
    }

    public boolean isCruiseOn(){
        return cruiseControlOn;
    }

    public void turnOnCruise(){
        cruiseControlOn = true;
        System.out.println("Cruise control turned on.");
    }

    public void turnOffCruise(){
        cruiseControlOn = false;
        System.out.println("Cruise control off.");
    }

    public void cruiseControl(){
        if (cruiseControlOn) {
            System.out.println(this.getTypeName() + " is driving " + this.getSpeed() + " km/h");
            if (gasolineLevel <= 0){
                turnOffCruise();
                System.out.println("Out of gas");
            }
            else if (this.speed < cruiseSpeed && cruiseSpeed <= maxSpeed && gasolineLevel > 0){
                accelerate();
                System.out.println(this.gasolineLevel);
            }else if (this.speed > cruiseSpeed){
                decelerate(5);
                System.out.println(this.gasolineLevel);
            }else if (this.speed == cruiseSpeed || cruiseSpeed > maxSpeed){
                turnOffCruise();
            }
        }
    }
}
