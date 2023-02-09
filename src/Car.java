public class Car extends Transport<DriverB> {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Машина начинает движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Машина завершает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Машина заезжает на пит-стоп");
    }

    @Override
    public void bestTimeInCircle() {
        System.out.println("Лучшее время в круге " + Math.random() + 1);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: 120км/ч");
    }
}
