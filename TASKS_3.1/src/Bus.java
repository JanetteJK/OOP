public class Bus extends Car{
    private int passengers;

    public Bus(String typeName, int gasolineTankCapacity, double gasolineLevel, int speed, int breakGas, int gasConsumption){
        super(typeName, gasolineTankCapacity, gasolineLevel, speed,breakGas, gasConsumption);
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
