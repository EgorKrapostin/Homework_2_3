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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && expInYears == driver.expInYears && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, expInYears);
    }
}
