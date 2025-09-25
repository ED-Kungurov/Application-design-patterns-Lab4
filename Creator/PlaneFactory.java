public class PlaneFactory extends TransportFactory{
    @Override
    public Transport getTransport() {
        return new Plane();
    }
}
