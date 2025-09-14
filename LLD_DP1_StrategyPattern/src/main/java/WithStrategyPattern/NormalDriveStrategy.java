package WithStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal mode drive capability");
    }
}
