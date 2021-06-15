public class Main 
{
    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();

        User user = new User();
        Seller seller = new Seller();
        DeliveryWarehouse deliveryWarehouse = new DeliveryWarehouse();

        topic.register(user);
        topic.register(seller);
        topic.register(deliveryWarehouse);

        topic.locationChanged();

        topic.unregister(deliveryWarehouse);

        topic.locationChanged();
    }
}