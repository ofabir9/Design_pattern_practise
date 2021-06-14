public class SingletonSynchronizedMethod
{
    private static SingletonSynchronizedMethod instance;
    private SingletonSynchronizedMethod(){};
    public static synchronized SingletonSynchronizedMethod gSingletonSyncMethod()
    {
        if(instance==null)
        {
            instance=new SingletonSynchronizedMethod();
        }
        return instance;
    }
}