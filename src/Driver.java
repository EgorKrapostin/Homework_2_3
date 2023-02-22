import java.util.Objects;

public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int expInYears;

    public Driver(String name, boolean driverLicense, int expInYears) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.expInYears = expInYears;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", expInYears=" + expInYears +
                '}';
    }
}
