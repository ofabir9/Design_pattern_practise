public class Main 
{
    public static void main(String[] args) {
        
        Computer pc= ComputerFactory.getComputer(new PCFactory("4Gb", "1Tb", "Corei5"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16Gb", "20Tb", "Corei9"));

        System.out.println(pc.getClass().getName()+" "+pc);
        System.out.println(server.getClass().getName()+" "+server);
    }
}