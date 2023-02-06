public class Car extends Transport {
    private float engineVolume;
    private String gearbox;
    private final String bodyType;
    private int nubmer;
    private final int places;
    private boolean winterTires;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, float engineVolume, String gearbox, String bodyType, int nubmer, int places, boolean winterTires) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            engineVolume = 1.5F;
        }
        this.engineVolume = engineVolume;
        if (gearbox == null || gearbox.isEmpty()) {
            gearbox = "default";
        }
        this.gearbox = gearbox;
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "default";
        }
        this.bodyType = bodyType;
        if (nubmer < 0) {
            nubmer = 123456789;
        }
        this.nubmer = nubmer;
        if (places < 0) {
            places = 1;
        }
        this.places = places;
        this.winterTires = winterTires;
    }
}
