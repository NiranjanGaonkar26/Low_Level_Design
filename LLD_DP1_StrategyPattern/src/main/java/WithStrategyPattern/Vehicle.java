package WithStrategyPattern;

public class Vehicle {

    DriveStrategy di;

    Vehicle(DriveStrategy di){
        this.di = di;
    }

    public void driveVehicle(){
        di.drive();
    }
}
