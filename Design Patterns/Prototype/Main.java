public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.insertData();
        System.out.println(prototype.getItemList());
        
        //CLONING THE FIRST OBJECT INTO SECOND OBJECT
        Prototype prototype2 = (Prototype) prototype.clone();
        System.out.println(prototype2.getItemList());

    }
}