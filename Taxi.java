public class Taxi extends Vehicle {
    public Taxi(String id, int capacity){
        super(id, capacity);
    }

    @Override
    public void displayInfo(){
        System.out.println("Taxi ID: " + id + " Capacity: " + capacity);
    }
}
