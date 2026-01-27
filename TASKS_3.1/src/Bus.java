public class Bus extends Car{
    private int passengers;

    public Bus(String typeName, int gasolineLevel, int speed, int gasolineTankCapacity){
        super(typeName, gasolineLevel, gasolineTankCapacity, speed);
    }
    public void passengersEnter(int passenger){
        passengers = passengers + passenger;
        System.out.println(passenger + " passengers entered the bus");
        System.out.println("The bus has " + passengers + " passengers");
    }
    public void passengersExit(int passenger){
        passengers = passengers - passenger;
        System.out.println(passenger + " passengers left the bus");
        System.out.println("The bus has " + passengers + " passengers" );
    }
}
