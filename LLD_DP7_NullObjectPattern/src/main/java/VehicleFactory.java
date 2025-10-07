public class VehicleFactory {
    public Vehicle getVehicle(String vehicleName){
        if(vehicleName.equalsIgnoreCase("car")){
            return new Car();
        }
        if(vehicleName.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return new VehicleNullObject();
    }
}
