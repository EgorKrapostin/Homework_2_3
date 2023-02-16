public class Car extends Transport<DriverB> {
    private BodyType bodyType;
    public Car(String brand, String model, float engineVolume,BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
    public void getType() {
        System.out.println(Type.CAR);
    }

    @Override
    public void printType() {
        System.out.println(bodyType == null ? "Данных по транспортному средству недостаточно" : bodyType);
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль прошел диагностику");
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

    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "BodyType{" +
                    "Тип кузова='" + bodyType + '\'' +
                    '}';
        }
    }

}
