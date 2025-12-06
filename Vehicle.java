public abstract class Vehicle {
    protected String id;
    protected int capacity;

    public Vehicle(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }

    public abstract void displayInfo();
}
