package test.com.liudaye.pattern.create.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 懒汉线程安全方式 单例模式
 * <p>虽然是线程安全的，但是并发时效率极低
 *
 * @author Liuhongming
 * @version 1.0 2017/9/11 15:57
 * @since 1.7
 */
public class SynchronizedMethodSingleton {
    private final static Logger log = LoggerFactory.getLogger(SynchronizedMethodSingleton.class);
    
    private static SynchronizedMethodSingleton instance;
    
    private SynchronizedMethodSingleton() {
    }
    
    public static synchronized SynchronizedMethodSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedMethodSingleton();
        }
        return instance;
    }
}