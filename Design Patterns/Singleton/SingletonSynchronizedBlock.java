public class SingletonSynchronizedBlock {
    private static SingletonSynchronizedBlock instance;
    private SingletonSynchronizedBlock(){};
    public static SingletonSynchronizedBlock gSingletonSynchronizedBlock()
    {
        if(instance==null)
        {
            synchronized (SingletonSynchronizedBlock.class)
            {
                if(instance==null)
                {
                    instance=new SingletonSynchronizedBlock();
                }
            }
        }
        return instance;
    }
}
