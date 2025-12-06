public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-1", 40);
        Taxi taxi = new Taxi("Taxi-1", 4);

        bus.displayInfo();
        taxi.displayInfo();
    }
}
