import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransportFactory tf;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 1) {
            tf = new MotorcycleFactory();
            Transport mot = tf.getTransport();
            mot.move();
            mot.fuelUp();
        }else if(input == 2) {
            tf = new PlaneFactory();
            Transport mot = tf.getTransport();
            mot.move();
            mot.fuelUp();
        }else if(input == 3) {
            tf = new CarFactory();
            Transport mot = tf.getTransport();
            mot.move();
            mot.fuelUp();
        }
        else if(input == 4) {
            tf = new BicycleFactory();
            Transport mot = tf.getTransport();
            mot.move();
            mot.fuelUp();
        }
        else {
            System.out.println("ERROR");
        }
    }
}
