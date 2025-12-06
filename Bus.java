public class Bus extends Vehicle {
    public Bus(String id, int capacity){
        super(id, capacity);
    }

    @Override
    public void displayInfo(){
        System.out.println("Bus ID: " + id + " Capacity: " + capacity);
    }
}
