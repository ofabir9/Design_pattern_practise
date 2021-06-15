public class Main 
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.VehicleBuilder("engine", 2).setAirbags(3).build();
        Vehicle vehicle2 = new Vehicle.VehicleBuilder("engine", 3).build();
        System.out.println(vehicle);
        System.out.println(vehicle2);
    }
}