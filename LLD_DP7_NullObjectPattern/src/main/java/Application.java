public class Application {
    public static void main(String[] args) {
        VehicleFactory vehicleFac = new VehicleFactory();
        Vehicle car = vehicleFac.getVehicle("CAR");
        Vehicle bike = vehicleFac.getVehicle("BIKE");
        Vehicle bus = vehicleFac.getVehicle("BUS");

        printVehicleDetails(car);
        printVehicleDetails(bike);
        printVehicleDetails(bus);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seating Capacity = "+vehicle.seatingCapacity()+" seats");
        System.out.println("Tank Capacity = "+vehicle.tankCapacity()+" L");
    }
}
