package WithStrategyPattern;

public class Application {
    public static void main(String[] args) {

        Vehicle vh1 = new PassengerVehicle();
        vh1.driveVehicle();

        Vehicle vh2 = new SportsVehicle();
        vh2.driveVehicle();

        Vehicle vh3 = new OffRoadVehicle();
        vh3.driveVehicle();
    }
}
