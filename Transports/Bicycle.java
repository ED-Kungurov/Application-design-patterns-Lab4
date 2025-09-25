public class Bicycle implements Transport {
    @Override
    public void move() {
        System.out.println("Велосипед движется");
    }

    @Override
    public void fuelUp() {
        System.out.println("Велосипед не заправляется");
    }
}
