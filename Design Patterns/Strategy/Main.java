public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("Add 10+5 = " + context.executeStrategy(10, 5));
        Context context2 = new Context(new OperationSubtract());
        System.out.println("Sub 10-5 = " + context2.executeStrategy(10, 5));
        Context context3 = new Context(new OperationMultiply());
        System.out.println("Mul 10*5 = " + context3.executeStrategy(10, 5));
    }
}
