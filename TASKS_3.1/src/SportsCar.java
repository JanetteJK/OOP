public class SportsCar extends Car {
    private int speed;
    private int gasolineLevel;


    public SportsCar(String typeName, double gasolineTankCapacity) {
        super(typeName, gasolineTankCapacity);
    }

    public void sportCarAccelerate() {
        System.out.println("uwu");
        if (gasolineLevel > 0) {
            System.out.println("kovaa");
            this.speed += 30;
        }
        else {
            this.speed = 0;
        }
    }
        public void sportCarDecelerate () {
            if (gasolineLevel > 0) {
                gasolineLevel -= 15;
                this.speed -= 30;
                }
            else {
                speed = 0;
                }
            }



}

