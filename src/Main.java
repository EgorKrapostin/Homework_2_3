public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("BMW", "1", 2000, "Germany", "yellow", 50);
        Bus bus1 = new Bus("Audi", "2", 2001, "Germany", "Red", 55);
        Bus bus2 = new Bus("Opel", "2", 2021, "Germany", "Red", 55);

        System.out.println(bus1.toString());
    }
}