public class MotorcycleFactory extends TransportFactory{
    @Override
    public Transport getTransport() {
        return new Motorcycle();
    }
}
