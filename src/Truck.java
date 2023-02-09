public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик завершает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик заезжает на пит-стоп");
    }

    @Override
    public void bestTimeInCircle() {
        System.out.println("Лучшее время в круге " + Math.random() + 1);
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: 80км/ч");
    }
}
