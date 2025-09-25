public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Машина движется");
    }

    @Override
    public void fuelUp() {
        System.out.println("Машина заправляется");
    }
}
