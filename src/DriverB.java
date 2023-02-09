public class DriverB extends Driver {

    public DriverB(String name, boolean driverLicense, int expInYears) {
        super(name, driverLicense, expInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель начинает движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель завершает движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель заправляет машину");
    }
}
