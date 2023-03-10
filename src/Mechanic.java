public class Mechanic {
    private String name;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void maintenance() {
        System.out.println("Механник проводит техобслуживание");
    }

    public void fixTransport() {
        System.out.println("Механиик чинит транспорт");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
