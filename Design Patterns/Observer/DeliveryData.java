import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject {

    List<Observer> observers;
    String location;
    public DeliveryData()
    {
        this.observers=new ArrayList<>();
    }

    
    @Override
    public void register(Observer observer) {
        // TODO Auto-generated method stub
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        // TODO Auto-generated method stub
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for(Observer observer: observers)
        {
            observer.update(location);
        }
    }

    public void locationChanged()
    {
        this.location = getLocation();
        notifyObservers();
    }
    public String getLocation()
    {
        return "Location X";
    }
    
}
