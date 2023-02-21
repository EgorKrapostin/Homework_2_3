import java.io.IOException;
import java.util.List;

public class Bus extends Transport<DriverD> {
    private Capacity capacity;
    public Bus(String brand, String model, float engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Bus(String brand, String model, float engineVolume, DriverD driver, List<Mechanic> mechanicList, Capacity capacity) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.capacity = capacity;
    }

    @Override
    public void startMove() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус завершает движение");
    }

    @Override
    public void getType() {
        System.out.println(Type.BUS);
    }

    @Override
    public void printType() {
        System.out.println(capacity == null ? "Данных по транспортному средству недостаточно" : capacity);
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусу проходить диагонстику не нужно");
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
        System.out.println("Максимальная скорость: 60км/ч");
    }

    enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(10,25),
        MEDIUM(25,50),
        LARGE(50,80),
        EXTRA_LARGE(80,120);

        private Integer lowerBound;
        private Integer upperBound;

        Capacity(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        @Override
        public String toString() {
            return "Capacity{" +
                    "Нижняя граница=" + (lowerBound == null ? " " : lowerBound)+
                    " Верхняя граница=" + upperBound +
                    '}';
        }
    }

}
