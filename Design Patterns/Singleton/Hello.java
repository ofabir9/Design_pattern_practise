public class Hello {
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);

        SingletonSynchronizedMethod singletonSynchronizedMethod = SingletonSynchronizedMethod.gSingletonSyncMethod();
        System.out.println(singletonSynchronizedMethod);
        SingletonSynchronizedMethod singletonSynchronizedMethod2 = SingletonSynchronizedMethod.gSingletonSyncMethod();
        System.out.println(singletonSynchronizedMethod2);

        SingletonSynchronizedBlock singletonSynchronizedBlock = SingletonSynchronizedBlock.gSingletonSynchronizedBlock();
        System.out.println(singletonSynchronizedBlock);
        SingletonSynchronizedBlock singletonSynchronizedBlock2 = SingletonSynchronizedBlock.gSingletonSynchronizedBlock();
        System.out.println(singletonSynchronizedBlock2);
        
    }
}
