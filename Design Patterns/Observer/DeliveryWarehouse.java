public class DeliveryWarehouse implements Observer{

    private String location;
    @Override
    public void update(String location) {
        // TODO Auto-generated method stub
        this.location = location;
        showLocation();
    }
    public void showLocation()
    {
        System.out.println("DeliveryWarehouse Notification, Current Location: "+location);
    }
    
}
