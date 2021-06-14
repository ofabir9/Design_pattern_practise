import java.util.ArrayList;
import java.util.List;

public class Prototype implements Cloneable {
    private List<String> itemList;
    public Prototype()
    {
        this.itemList=new ArrayList<String>();
    }
    public Prototype(List<String> list)
    {
        this.itemList = list;
    }
    public void insertData()
    {
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");
    }
    public List<String> getItemList()
    {
        return this.itemList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        List<String> tempList = new ArrayList<String>();
        for(String str : this.itemList)
        {
            tempList.add(str);
        }
        return new Prototype(tempList);
    }
}
