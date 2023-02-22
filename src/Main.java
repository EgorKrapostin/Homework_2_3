import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mechanic mech = new Mechanic("Иванов Иван", "Компания");
        Mechanic mech1 = new Mechanic("Иванов Иван1", "Компания1");
        Mechanic mech2 = new Mechanic("Иванов Иван2", "Компания2");
        Mechanic mech3 = new Mechanic("Иванов Иван3", "Компания3");
        Mechanic mech4 = new Mechanic("Иванов Иван4", "Компания4");

        List<Mechanic> carMechanicList = new ArrayList<>();
        carMechanicList.add(mech);
        carMechanicList.add(mech1);
        carMechanicList.add(mech2);

        Car car1 = new Car("Audi", "Audi", 2F, new DriverB("Ивано Иван", true, 5), carMechanicList, Car.BodyType.SEDAN);
        System.out.println(car1);

        List<Mechanic> busMechanicList = new ArrayList<>();
        busMechanicList.add(mech3);
        busMechanicList.add(mech4);

        Bus bus1 = new Bus("Bus", "Bus", 1.2F, new DriverD("Иванов Иван", true, 8), busMechanicList, Bus.Capacity.MEDIUM);
        System.out.println(bus1);

        List<Mechanic> truckMechanicList = new ArrayList<>();
        truckMechanicList.add(mech);
        truckMechanicList.add(mech4);

        Truck truck1 = new Truck("Truck", "Truck", 1.5F, new DriverC("Иванов Иван", true, 6), truckMechanicList, Truck.CarryingCapacity.N2);
        System.out.println(truck1);

        List<Transport> transportList = new ArrayList<>();
        transportList.add(car1);
        transportList.add(bus1);
        transportList.add(truck1);

        Queue<Serviceable> serviceableQueue = new LinkedList<>();
        ServiceStation serviceStation = new ServiceStation(serviceableQueue);
        serviceStation.addTransportToQueue(car1);
        serviceStation.addTransportToQueue(truck1);
        serviceStation.technicalInspection(car1);
        serviceStation.technicalInspection(truck1);
        System.out.println(serviceableQueue);

        Driver driver = new DriverC("Иванов Иван", true, 8);
        Driver driver1 = new DriverC("Иванов Иван", true, 8);
        Driver driver2 = new DriverB("Иванов Иван2", true, 1);
        Driver driver3 = new DriverD("Ивано Иван3", true, 5);
        Set<Driver> drivers = new HashSet<>();
        drivers.add(driver);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        System.out.println(drivers);
    }
}