package test.com.liudaye.pattern.create.singleton;

/**
 * 饿汉 单例模式 线程安全
 * <p>基于classloder机制避免了多线程的同步问题
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 16:54
 * @since 1.7
 */
public class ClassLoaderSingleton {
    private static ClassLoaderSingleton instance = new ClassLoaderSingleton();
    
    private ClassLoaderSingleton() {
    }
    
    public static ClassLoaderSingleton getInstance() {
        return instance;
    }
}