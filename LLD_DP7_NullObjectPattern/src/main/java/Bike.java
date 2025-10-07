public class Bike implements Vehicle{
    @Override
    public int tankCapacity() {
        return 12;
    }

    @Override
    public int seatingCapacity() {
        return 2;
    }
}
