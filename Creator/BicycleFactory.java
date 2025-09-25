public class BicycleFactory extends TransportFactory {
    @Override
    public Transport getTransport() {
        return new Bicycle();
    }
}
