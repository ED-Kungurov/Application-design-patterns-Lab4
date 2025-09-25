public class CarFactory extends TransportFactory {
    @Override
    public Transport getTransport() {
        return new Car();
    }
}
