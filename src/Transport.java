public abstract class Transport<T extends Driver> implements Competitionable {
    private final String brand;
    private final String model;
    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.2F;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void getType();
    public abstract void printType();

    enum Type {
        CAR("Легковой автомобиль"),
        BUS("Автобус"),
        TRUCK("Грузовик");

        private String transportType;

        Type(String transportType) {
            this.transportType = transportType;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
