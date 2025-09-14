package WithStrategyPattern;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports mode drive capability");
    }
}
