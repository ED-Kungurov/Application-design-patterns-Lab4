public class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("самолет движется");
    }

    @Override
    public void fuelUp() {
        System.out.println("самолет заправляется");
    }
}
