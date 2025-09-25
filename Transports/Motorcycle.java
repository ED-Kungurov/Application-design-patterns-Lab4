public class Motorcycle implements Transport {
    @Override
    public void move() {
        System.out.println("мотоцикл движется");
    }

    @Override
    public void fuelUp() {
        System.out.println("мотоцикл заправляется");
    }
}
