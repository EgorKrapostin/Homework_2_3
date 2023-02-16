import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi","Audi",2F, Car.BodyType.SEDAN);
        Bus bus = new Bus("Bus", "Bus", 1.2F, Bus.Capacity.MEDIUM);
        Truck truck = new Truck("Truck", "Truck", 1.5F, Truck.CarryingCapacity.N2);

        car.getType();
        car.printType();
        car.passDiagnostics();
        bus.getType();
        bus.printType();
        try {
            bus.passDiagnostics();
        } catch (TransportTypeException e) {
            e.printStackTrace();

        }
        truck.getType();
        truck.printType();
        truck.passDiagnostics();
    }

}