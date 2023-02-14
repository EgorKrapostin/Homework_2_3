public class Truck extends Transport<DriverC> {
    CarryingCapacity carryingCapacity;
    public Truck(String brand, String model, float engineVolume,CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume);
        this.carryingCapacity = carryingCapacity;
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
    public void getType() {
        System.out.println(Type.TRUCK);
    }

    @Override
    public void printType() {
        System.out.println(carryingCapacity == null ? "Данных по транспортному средству недостаточно" : carryingCapacity);
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

    enum CarryingCapacity {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null),
        ;

        private Float lowerBound;
        private Float upperBound;

        CarryingCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return "CarryingCapacity{" +
                    "Нижняя граница=" + (lowerBound == null ? "" : lowerBound) + " " +
                    "Верхняя граница=" + (upperBound == null ? "" : upperBound) +
                    '}';
        }



    }

}